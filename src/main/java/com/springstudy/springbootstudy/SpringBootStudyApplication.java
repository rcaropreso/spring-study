package com.springstudy.springbootstudy;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springstudy.springbootstudy.domain.Category;
import com.springstudy.springbootstudy.repositories.CategoryRepository;

@SpringBootApplication
public class SpringBootStudyApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository catRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Seed database

		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		catRepo.saveAll(Arrays.asList(cat1, cat2));
	}
}
