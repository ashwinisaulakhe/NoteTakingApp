package com.notetaking.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notetaking.model.NoteListViewModel;
import com.notetaking.model.NotesModel;
import com.notetaking.repository.ToDoRepository;

@Controller
public class ToDoController {

	@Autowired
	private ToDoRepository toDoRepository;
	public ToDoController() {
		super();
	}
	public ToDoController(ToDoRepository toDoRepository) {
		super();
	}
	@RequestMapping("/")
    public String index(Model model) {
        ArrayList<NotesModel> todoList = (ArrayList<NotesModel>) toDoRepository.findAll();
        //model.addAttribute("items", todoList);
        model.addAttribute("newitem", new NotesModel());
        model.addAttribute("items", new NoteListViewModel(todoList));
        return "index";
    }

    @RequestMapping("/add")
    public String addTodo(@ModelAttribute NotesModel requestItem) {
        NotesModel item = new NotesModel(requestItem.getTask_assigine(), requestItem.getExpected_time());
        toDoRepository.save(item);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String updateTodo(@ModelAttribute NoteListViewModel requestItems) {
        for (NotesModel requestItem : requestItems.getTodoList() ) {
             NotesModel item = new NotesModel(requestItem.getTask_assigine(), requestItem.getExpected_time());
             item.setId(requestItems.getTask_Id());
             toDoRepository.save(item);
        }
        return "redirect:/";
}
	
}
