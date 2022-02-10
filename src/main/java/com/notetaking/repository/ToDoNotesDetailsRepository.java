package com.notetaking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.notetaking.model.NotesDetailsModel;

@Repository
public interface ToDoNotesDetailsRepository extends CrudRepository<NotesDetailsModel, Long> {

}
