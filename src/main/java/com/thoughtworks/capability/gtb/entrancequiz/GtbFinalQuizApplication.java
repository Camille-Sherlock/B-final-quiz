package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//TODO GTB：为什么需要加@EnableAutoConfiguration这个注解？
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class GtbFinalQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbFinalQuizApplication.class, args);
	}

}
