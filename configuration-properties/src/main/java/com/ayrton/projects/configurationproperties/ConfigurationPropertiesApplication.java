package com.ayrton.projects.configurationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class ConfigurationPropertiesApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(ConfigurationPropertiesApplication.class, args);
	
	MyAppConfig configApp = (MyAppConfig) ctx.getBean("myAppConfig");
	System.out.println(configApp.toString());
	}

}
