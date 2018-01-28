package org.huxin.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;






@EnableAutoConfiguration
@Configuration
@ComponentScan
//@ImportResource(locations={"classpath:spring-common.xml"})
public class Bootstrap {
	
	 
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Bootstrap.class, args);
	}

}
