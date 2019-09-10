package com.springstudy.springbootstudy.repositories;

//Este tipo de objeto faz acesso ao banco de dados 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springstudy.springbootstudy.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
