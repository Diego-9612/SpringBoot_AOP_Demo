package com.diego.springboot.aop.project_aop_springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class ProjectAopSpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAopSpringbootDemoApplication.class, args);
	}

}
