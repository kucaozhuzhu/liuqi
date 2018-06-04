package com.liuqi.tyrone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1 分布式任务调度
 * 2 zookeeper分布式锁
 * 3 mybatis乐观锁（插件整合）
 * 4 dubbo整合
 * 5 待定
 */
@SpringBootApplication
public class TyroneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TyroneApplication.class, args);
	}
}
