package com.notetaking.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.notetaking.model.NotesDetailsModel;
import com.notetaking.model.NotesModel;
@Repository
public interface ToDoRepository extends CrudRepository<NotesModel, Long> {

	void save(NotesDetailsModel item);

	
}
