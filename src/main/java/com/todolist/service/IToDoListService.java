package com.todolist.service;

import java.util.List;
import java.util.Optional;

import com.todolist.entity.ToDoList;

public interface IToDoListService {
	
	public ToDoList add(ToDoList list);
	
	public List<ToDoList> getAllList();
	
	public Optional<ToDoList> getById(int taskId);
	
	public boolean updateList(ToDoList List);
	
	public boolean delete(Integer Id);

}
