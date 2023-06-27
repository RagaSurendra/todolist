package com.todolist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.todolist.entity.ToDoList;

@Repository
public interface ToDoListRepo extends JpaRepository< ToDoList, Integer>{
	

}
