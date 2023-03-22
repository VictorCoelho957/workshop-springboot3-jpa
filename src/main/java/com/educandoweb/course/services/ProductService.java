package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.ProductRepository;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class ProductService {
	
	//buscar todos usuarios atraves do postman
	
	//dependencia
	@Autowired 
	private ProductRepository repository;
	
	//metodo
	public List<Product> findAll(){
		return repository.findAll();
		
	}
	
	//recuerar por id
	
	public Product finById(Long id) {
		Optional <Product> obj =repository.findById(id);
		return obj.get();
	}
    
}
