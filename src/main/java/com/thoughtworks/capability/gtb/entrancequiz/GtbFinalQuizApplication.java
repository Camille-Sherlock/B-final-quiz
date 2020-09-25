package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.thoughtworks.capability.gtb.entrancequiz.repository" })
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = {"com.thoughtworks.capability.gtb.entrancequiz"})
@EntityScan("com.thoughtworks.capability.gtb.entrancequiz.domain")
@ComponentScan("com")
public class GtbFinalQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbFinalQuizApplication.class, args);
	}

}
