package com.notetaking.services;

import java.util.List;

import com.notetaking.model.NotesModel;

public interface INoteService {

	List<NotesModel> findAll();
}
