package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TripManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripManagementSystemApplication.class, args);
	}

}


//   http://localhost:8883/swagger-ui/#/

//This is my project