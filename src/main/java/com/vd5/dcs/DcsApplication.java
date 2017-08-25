package com.vd5.dcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class DcsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DcsApplication.class, args);


		context.getBean(ServerManager.class).start();
	}
}
