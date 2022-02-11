package com.notetaking.model;

import java.util.ArrayList;

public class NoteDetailsListViewModel {

	private ArrayList<NotesDetailsModel> todoList =new ArrayList<NotesDetailsModel>();

	
	public NoteDetailsListViewModel() {
		super();
	}

	public NoteDetailsListViewModel(ArrayList<NotesDetailsModel> todoList) {
		super();
		this.todoList = todoList;
	}

	public ArrayList<NotesDetailsModel> getTodoList() {
		return todoList;
	}

	public void setTodoList(ArrayList<NotesDetailsModel> todoList) {
		this.todoList = todoList;
	}

	public String getTask_Discription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getActual_Duration() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTask_Details_Id() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
