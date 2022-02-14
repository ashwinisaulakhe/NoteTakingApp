package com.notetaking.app.services;

import java.util.List;

import com.notetaking.app.model.NotesDetailsModel;

public interface INoteDetailsService {

	List<NotesDetailsModel> findAll();
}
