package com.notetaking.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notetaking.app.model.NotesDetailsModel;
import com.notetaking.app.Repository.ToDoNotesDetailsRepository;

@Service
public class NoteDetailsService implements INoteDetailsService{

	@Autowired 
	private ToDoNotesDetailsRepository detailsRepository;
	
	@Override
	public List<NotesDetailsModel> findAll(){
		return (List<NotesDetailsModel>) detailsRepository.findAll();
		
}
}