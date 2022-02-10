package com.notetaking.model;

import java.util.ArrayList;

public class NoteListViewModel {

	private ArrayList<NotesModel> todoList =new ArrayList<NotesModel>();

	
	public NoteListViewModel() {
		super();
	}

	public NoteListViewModel(ArrayList<NotesModel> todoList) {
		super();
		this.todoList = todoList;
	}

	public ArrayList<NotesModel> getTodoList() {
		return todoList;
	}

	public void setTodoList(ArrayList<NotesModel> todoList) {
		this.todoList = todoList;
	}
	
}
