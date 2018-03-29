package com.zhangqin.demo.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.zookeeper.ZookeeperAutoConfiguration;

/**
 * 系统模块项目启动文件
 * @author zhangqin
 *
 */
@SpringBootApplication(exclude = ZookeeperAutoConfiguration.class)
public class SysApplication {
	public static void main(String[] args) {
		SpringApplication.run(SysApplication.class, args);
	}
}
