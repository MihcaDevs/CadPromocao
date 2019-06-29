package com.acosta.cadpromo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acosta.cadpromo.domain.SocialMetaTag;
import com.acosta.cadpromo.service.SocialMetaTagService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	SocialMetaTagService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		SocialMetaTag og = service.getOpenGraphByUrl("https://www.udemy.com/spring-boot-mvc-com-thymeleaf/");
		System.out.println(og.toString());
		
		SocialMetaTag twitter = service. getTwitterCardByUrl("https://www.udemy.com/spring-boot-mvc-com-thymeleaf/");
		System.out.println(twitter.toString());
		
	}
}
