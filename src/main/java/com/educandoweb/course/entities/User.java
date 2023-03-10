package com.educandoweb.course.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name= "tb_user")
public class User {
	
	@Id//chave primaria
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String  name;
	private String email;
	private String phone;
	private String passaword;
	
	//associação, um usurario tem varios pedidos, com chave estrangeira, relação n-1
	@JsonIgnore //evita repetição ao fazer consultas no postman
	@OneToMany(mappedBy="client")
	private List<Order> orders= new ArrayList<>();
	
	public User () {
		
	}

	public User(Long id, String name, String email, String phone, String passaword) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.passaword = passaword;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassaword() {
		return passaword;
	}

	public void setPassaword(String passaword) {
		this.passaword = passaword;
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}

	
	
	

}
