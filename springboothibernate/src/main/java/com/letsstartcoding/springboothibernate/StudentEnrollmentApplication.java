package com.letsstartcoding.springboothibernate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StudentEnrollmentApplication {
//extends SpringBootServletInitializer{

	// protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	 //       return application.sources(StudentEnrollmentApplication.class);
	 //   }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(StudentEnrollmentApplication.class, args);
		

	}

}
