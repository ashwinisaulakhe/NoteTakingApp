package com.notetaking.services;

import java.util.List;

import com.notetaking.model.NotesDetailsModel;

public interface INoteDetailsService {

	List<NotesDetailsModel> findAll();
}
