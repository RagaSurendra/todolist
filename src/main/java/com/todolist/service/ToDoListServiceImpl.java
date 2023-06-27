package com.todolist.service;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.entity.ToDoList;
import com.todolist.repo.ToDoListRepo;

@Service
public class ToDoListServiceImpl implements IToDoListService{
	
	@Autowired
	private ToDoListRepo toDoListRepo;

	@Override
	public List<ToDoList> getAllList() {
		List<ToDoList> List = toDoListRepo.findAll();
		return List;
	}

	@Override
	public boolean updateList(ToDoList list) {
		try {
			
			ToDoList updatelist = new ToDoList();
			updatelist.setId(list.getId());
			updatelist.setName(list.getName());
					toDoListRepo.save(updatelist);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Integer Id) {
		toDoListRepo.deleteById(Id);
		return false;
	}

	@Override
	public ToDoList add(ToDoList list) {
		return toDoListRepo.saveAndFlush(list);
	}

	@Override
	public Optional<ToDoList> getById(int Id) {
		Optional<ToDoList> todo = toDoListRepo.findById(Id);
		return todo;
	}
	
}
