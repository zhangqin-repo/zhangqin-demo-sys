package com.zhangqin.demo.sys.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.type.EnumOrdinalTypeHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.MybatisConfiguration;
import com.baomidou.mybatisplus.incrementer.H2KeyGenerator;
import com.baomidou.mybatisplus.incrementer.IKeyGenerator;
import com.baomidou.mybatisplus.mapper.ISqlInjector;
import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.plugins.parser.ISqlParser;
import com.baomidou.mybatisplus.plugins.parser.tenant.TenantHandler;
import com.baomidou.mybatisplus.spring.boot.starter.MybatisPlusProperties;
import com.github.pagehelper.PageHelper;
import com.zhangqin.framework.common.enums.CompareOperator;
import com.zhangqin.framework.dal.mybatisplus.MyMetaObjectHandler;
import com.zhangqin.framework.dal.mybatisplus.MySqlInjector;
import com.zhangqin.framework.dal.mybatisplus.MyTenantSqlParser;

import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.StringValue;

@Configuration
@MapperScan({ "com.zhangqin.demo.*.mapper*" })
public class MybatisPlusConfig {

	/**
	 * mybatis-plus SQL执行效率插件【生产环境可以关闭】
	 */
	//@Bean
	public PerformanceInterceptor performanceInterceptor() {
		return new PerformanceInterceptor();
	}
	
	/**
	 * mybatis分页插件，使用com.github.pagehelper.PageHelper
	 * 
	 * @param mybatisProperties
	 * @return
	 * @throws ClassNotFoundException
	 */
    @Bean
	public Interceptor mybatisPageHelper(MybatisPlusProperties mybatisProperties) throws ClassNotFoundException{
		// 分页插件
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("reasonable", "true");
		properties.setProperty("supportMethodsArguments", "true");
		properties.setProperty("returnPageInfo", "check");
		properties.setProperty("params", "count=countSql");
		pageHelper.setProperties(properties);
		return pageHelper;
	}

	/**
	 * mybatis-plus分页插件<br>
	 * 文档：http://mp.baomidou.com<br>
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
		paginationInterceptor.setLocalPage(false);// 开启 PageHelper 的支持
		/*
		 * 【测试多租户】 SQL 解析处理拦截器<br> 这里固定写成住户 1 实际情况你可以从cookie读取，因此数据看不到 【 麻花藤 】 这条记录（
		 * 注意观察 SQL ）<br>
		 */
		List<ISqlParser> sqlParserList = new ArrayList<ISqlParser>();
		MyTenantSqlParser tenantSqlParser = new MyTenantSqlParser();
		tenantSqlParser.setTenantHandler(new TenantHandler() {
			
			public Expression getTenantId() {
				return new StringValue("'1'");
				// return new StringValue(TenantSelector.getTenantId());
			}

			public String getTenantIdColumn() {
				return "tenant_id";
			}

			public boolean doTableFilter(String tableName) {
				// 这里可以判断是否过滤表
				if ("sys_tenant".equals(tableName)) {
					return true;
				}
				return false;
			}
		});

		sqlParserList.add(tenantSqlParser);
		paginationInterceptor.setSqlParserList(sqlParserList);
		// 以下过滤方式与 @SqlParser(filter = true) 注解等效
		// paginationInterceptor.setSqlParserFilter(new ISqlParserFilter() {
		// @Override
		// public boolean doFilter(MetaObject metaObject) {
		// MappedStatement ms = PluginUtils.getMappedStatement(metaObject);
		// // 过滤自定义查询此时无租户信息约束【 麻花藤 】出现
		// if
		// ("com.baomidou.springboot.mapper.UserMapper.selectListBySQL".equals(ms.getId()))
		// {
		// return true;
		// }
		// return false;
		// }
		// });

		return paginationInterceptor;
	}

	@Bean
	public MetaObjectHandler metaObjectHandler() {
		return new MyMetaObjectHandler();
	}

	/**
	 * 注入主键生成器
	 */
	@Bean
	public IKeyGenerator keyGenerator() {
		return new H2KeyGenerator();
	}

	/**
	 * 注入sql注入器
	 */
	@Bean
	public ISqlInjector sqlInjector() {
		return new MySqlInjector();
	}
}
