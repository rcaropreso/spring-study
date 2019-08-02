package com.springstudy.springbootstudy.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springstudy.springbootstudy.domain.Category;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Category> list() {
		
		Category cat1 = new Category(1, "Informatica");
		Category cat2 = new Category(2, "Escritorio");
		
		List<Category> vCat = new ArrayList<>();
		vCat.add(cat1);
		vCat.add(cat2);
		
		return vCat;
	}
	
}
