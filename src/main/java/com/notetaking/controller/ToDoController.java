package com.notetaking.controller;

import org.springframework.stereotype.Controller;

import com.notetaking.repository.ToDoRepository;

@Controller
public class ToDoController {

	private ToDoRepository toDoRepository;

	public ToDoController() {
		super();
	}
	
}
