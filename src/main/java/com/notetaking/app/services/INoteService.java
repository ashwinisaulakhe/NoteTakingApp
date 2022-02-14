package com.notetaking.app.services;

import java.util.List;

import com.notetaking.app.model.NotesModel;

public interface INoteService {

	List<NotesModel> findAll();

	
}