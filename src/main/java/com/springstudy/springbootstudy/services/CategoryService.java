package com.springstudy.springbootstudy.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springstudy.springbootstudy.domain.Category;
import com.springstudy.springbootstudy.repositories.CategoryRepository;
import com.springstudy.springbootstudy.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;
	
	public Category find(Integer id) {
		Optional<Category> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found - Id: " + id + ", Type: " + 
		        Category.class.getName()));
	}	
}
