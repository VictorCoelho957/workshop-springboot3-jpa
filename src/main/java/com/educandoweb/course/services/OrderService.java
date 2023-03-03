package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	//buscar todos usuarios atraves do postman
	
	//dependencia
	@Autowired 
	private OrderRepository repository;
	
	//metodo
	public List<Order>findAll(){
		return repository.findAll();
		
	}
	
	//recuerar por id
	
	public Order finById(Long id) {
		Optional <Order> obj =repository.findById(id);
		return obj.get();
	}
    
}
