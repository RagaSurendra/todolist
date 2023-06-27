package com.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ToDoListApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApp1Application.class, args);
		System.err.println("Application successfully Running");
	}  

}
