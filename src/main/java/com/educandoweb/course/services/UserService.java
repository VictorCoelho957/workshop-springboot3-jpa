package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {
	
	//buscar todos usuarios atraves do postman
	
	//dependencia
	@Autowired 
	private UserRepository repository;
	
	//metodo
	public List<User>findAll(){
		return repository.findAll();
		
	}
	
	//recuerar por id
	
	public User finById(Long id) {
		Optional <User> obj =repository.findById(id);
		return obj.get();
	}
	
	//inserção
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	//exclusão
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity= repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		
		
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
	
	
	
    
}
