package com.habib.ci;

import org.springframework.boot.SpringApplication;

public class TestCiIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.from(CiIntegrationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
