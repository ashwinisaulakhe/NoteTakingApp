package com.notetaking.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notetaking.app.model.NotesModel;
import com.notetaking.app.Repository.ToDoRepository;
@Service

public class NoteService implements INoteService {
	
	@Autowired 
	private ToDoRepository repository;
	
	@Override
	public List<NotesModel> findAll(){
		return (List<NotesModel>) repository.findAll();
	}
}