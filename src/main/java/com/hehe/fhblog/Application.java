package com.hehe.fhblog;

import com.hehe.fhblog.common.boot.FhblogBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(Application.class);
		application.setBanner(new FhblogBanner());
		application.run(args);
	}
}
