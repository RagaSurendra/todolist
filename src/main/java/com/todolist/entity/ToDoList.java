package com.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name ="to_do_list")
public class ToDoList {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer Id;
	private String name;
	
	public ToDoList() {
	
	}
	
	public ToDoList(Integer id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
}
