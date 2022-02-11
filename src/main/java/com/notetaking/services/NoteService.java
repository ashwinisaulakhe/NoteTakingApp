package com.notetaking.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notetaking.model.NotesModel;
import com.notetaking.repository.ToDoRepository;
@Service

public class NoteService implements INoteService {
	
	@Autowired 
	private ToDoRepository repository;
	
	@Override
	public List<NotesModel> findAll(){
		return (List<NotesModel>) repository.findAll();
	}
}
