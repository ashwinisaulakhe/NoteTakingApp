package com.notetaking.app.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notetaking.app.model.NoteDetailsListViewModel;
import com.notetaking.app.model.NotesDetailsModel;
import com.notetaking.app.Repository.ToDoNotesDetailsRepository;

@Controller
public class ToDoNoteDetailsController {

	@Autowired
	private ToDoNotesDetailsRepository toDoNoteDetailsRepository;
	
	
	public ToDoNoteDetailsController() {
		super();
	}
	public ToDoNoteDetailsController(ToDoNotesDetailsRepository toDoNotesDetailsRepository) {
		super();
	}
	@RequestMapping("/")
    public String index(Model model) {
        ArrayList<NotesDetailsModel> todoList = (ArrayList<NotesDetailsModel>) toDoNoteDetailsRepository.findAll();
        //model.addAttribute("items", todoList);
        model.addAttribute("newitem", new NotesDetailsModel());
        model.addAttribute("items", new NoteDetailsListViewModel(todoList));
        return "index";
    }

    @RequestMapping("/add")
    public String addTodo(@ModelAttribute NotesDetailsModel requestItem) {
        NotesDetailsModel item = new NotesDetailsModel(requestItem.getTask_Discription(), requestItem.getActual_Duration());
        toDoNoteDetailsRepository.save(item);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String updateTodo(@ModelAttribute NoteDetailsListViewModel requestItems) {
        for (NotesDetailsModel requestItem : requestItems.getTodoList() ) {
             NotesDetailsModel item = new NotesDetailsModel(requestItem.getTask_Discription(), requestItem.getActual_Duration());
             item.setId(requestItems.getTask_Details_Id());
             toDoNoteDetailsRepository.save(item);
        }
        return "redirect:/";
}
}
