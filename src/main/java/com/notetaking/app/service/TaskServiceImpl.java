package com.notetaking.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.notetaking.app.dto.TaskDetail;
import com.notetaking.app.dto.TaskRequest;
import com.notetaking.app.entities.Task;
import com.notetaking.app.repositories.TaskRepository;

@Service
public class TaskServiceImpl {

	@Autowired
	TaskRepository taskRepository;
	
	
	public ResponseEntity<Object> saveTask(TaskRequest taskRequest)
	{
		Task task =new Task();
		task.setTaskAssigine(taskRequest.getTaskAssigine());
		task.setExpectedTime(taskRequest.getExpectedTime());
		
		List<TaskDetail> taskDetailList = new ArrayList<>();
		for(TaskDetail td: taskRequest.getTaskDetails())
		{
			TaskDetail tsd =new TaskDetail();
			tsd.setTaskDiscription(td.getTaskDiscription());
			tsd.setActualDuration(td.getActualDuration());
			tsd.setTask(task);
			
			taskDetailList.add(tsd);
		}
		
		task.setTaskDetails(taskDetailList);
		
		Task ts= taskRepository.save(task);
		if(ts != null)
		{
			ResponseEntity<Object> response = new ResponseEntity<Object>(task, HttpStatus.OK);
			return response;
		}
		ResponseEntity<Object> response = new ResponseEntity<Object> ("{ \"status\": \"Task does not found. \"}", HttpStatus.OK);
		return response;
		
	}
	
		public List<Task> getTaskDetails()
		{
			return taskRepository.findAll();
		}
	}