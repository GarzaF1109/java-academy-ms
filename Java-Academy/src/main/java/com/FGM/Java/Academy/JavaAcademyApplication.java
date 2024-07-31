package com.FGM.Java.Academy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class JavaAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAcademyApplication.class, args);
	}

}
