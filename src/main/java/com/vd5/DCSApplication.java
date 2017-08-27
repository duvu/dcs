package com.vd5;

import com.vd5.dcs.ServerManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DCSApplication{

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DCSApplication.class, args);
		context.getBean(ServerManager.class).init().start();
	}
}
