package com.devstudios.redsocial.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class RedsocialUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedsocialUsersApplication.class, args);
	}

}
