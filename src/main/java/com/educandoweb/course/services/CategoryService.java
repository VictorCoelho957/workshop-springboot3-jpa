package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	//buscar todos usuarios atraves do postman
	
	//dependencia
	@Autowired 
	private CategoryRepository repository;
	
	//metodo
	public List<Category>findAll(){
		return repository.findAll();
		
	}
	
	//recuerar por id
	
	public Category finById(Long id) {
		Optional <Category> obj =repository.findById(id);
		return obj.get();
	}
    
}
