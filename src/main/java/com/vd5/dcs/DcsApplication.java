package com.vd5.dcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcsApplication.class, args);


		final Scanner scanner = new Scanner(System.in);
		while (true) {

            try { Thread.sleep(60L * 60L * 1000L); } catch (Throwable ignored) {}

//			final String input = scanner.nextLine();
//
//			if("q".equals(input.trim())) {
//				break;
//			}
//			else {
//				//final String result = gateway.send(input);
//				//System.out.println(result);
//			}
		}
	}
}
