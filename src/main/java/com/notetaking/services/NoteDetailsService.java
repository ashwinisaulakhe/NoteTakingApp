package com.notetaking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notetaking.model.NotesDetailsModel;
import com.notetaking.repository.ToDoNotesDetailsRepository;

@Service
public class NoteDetailsService implements INoteDetailsService{

	@Autowired 
	private ToDoNotesDetailsRepository detailsRepository;
	
	@Override
	public List<NotesDetailsModel> findAll(){
		return (List<NotesDetailsModel>) detailsRepository.findAll();
		
}

}