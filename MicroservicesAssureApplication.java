package com.urbanisation_si.microservices_assure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//J3- 6
@EnableSwagger2
public class MicroservicesAssureApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesAssureApplication.class, args);
	}

}
