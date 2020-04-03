package com.atul.jvm.jvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(JvmApplication.class, args);
		System.out.println("app is up and running --> ");
		int data  = 7;
		data  = value(data);
		System.out.println(data);
	}

	private static int value(int data) {
		int oldValue = data + 3;
		int neValue = oldValue * 2;
		return neValue;
	}

}
