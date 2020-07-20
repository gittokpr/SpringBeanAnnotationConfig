package com.finalHandson.SpringBeanAutoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.finalHandson.SpringBeanAutoConfig.model.Address;
import com.finalHandson.SpringBeanAutoConfig.model.Details;

@SpringBootApplication
public class SpringBeanAutoConfigApplication implements CommandLineRunner {
	
	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanAutoConfigApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Details details = context.getBean(Details.class);
		Address address = context.getBean(Address.class);
		System.out.println("Details: "+ details.toString());
		System.out.println("Address: "+ address.toString());
		
	}

}
