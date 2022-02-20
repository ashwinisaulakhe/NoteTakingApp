package com.notetaking.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notetaking.app.entities.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

	
}
