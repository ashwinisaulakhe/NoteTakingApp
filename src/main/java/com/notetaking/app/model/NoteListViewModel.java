package com.notetaking.app.model;

import java.util.ArrayList;

public class NoteListViewModel {

	private ArrayList<NotesModel> todoList =new ArrayList<NotesModel>();

	
	
	public NoteListViewModel(ArrayList<NotesModel> todoListN) {
		super();
		this.todoList = todoListN;
	}

	public ArrayList<NotesModel> getTodoList() {
		return todoList;
	}

	public void setTodoList(ArrayList<NotesModel> todoList) {
		this.todoList = todoList;
	}

	public int getTask_Id() {
		// TODO Auto-generated method stub
		return 0;
	}
}
