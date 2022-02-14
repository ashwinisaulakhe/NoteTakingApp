package com.notetaking.app.Repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.notetaking.app.model.NotesDetailsModel;
import com.notetaking.app.model.NotesModel;
@Repository
public interface ToDoRepository extends CrudRepository<NotesModel, Long> {

	void save(NotesDetailsModel item);

	
}