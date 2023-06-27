package com.todolist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entity.ToDoList;
import com.todolist.service.IToDoListService;


@RestController
@RequestMapping("/todolist")
public class TodoListController {
	
	@Autowired
	private IToDoListService iToDoListService;
	
	@PostMapping("/save")
	public ToDoList addList(@RequestBody ToDoList list) {
		return iToDoListService.add(list);
	}
	
	@GetMapping("/getlist")
	public List<ToDoList> get() {
		return iToDoListService.getAllList();
	}
	
	@PutMapping("/update")
	public String updateList( @RequestBody ToDoList list) {	
		iToDoListService.updateList(list);
		return "Updated successfully!";	
	}
	
	@DeleteMapping("/delete/{Id}")
	public String DeleteList(@PathVariable Integer Id) {
		iToDoListService.delete(Id);
		return "Deleted successfully!";
	}

	@GetMapping("/getbyid/{Id}")
	public Optional<ToDoList> getById(@PathVariable Integer Id) {
		return iToDoListService.getById(Id);
	}
}
