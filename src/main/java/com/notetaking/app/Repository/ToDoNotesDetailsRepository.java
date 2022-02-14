package com.notetaking.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.notetaking.app.model.NotesDetailsModel;

@Repository
public interface ToDoNotesDetailsRepository extends CrudRepository<NotesDetailsModel, Long> {

}