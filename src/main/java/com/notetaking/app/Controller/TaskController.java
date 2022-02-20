package com.notetaking.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.notetaking.app.dto.TaskRequest;
import com.notetaking.app.entities.Task;
import com.notetaking.app.service.TaskServiceImpl;

@RestController
public class TaskController {

	@Autowired
	TaskServiceImpl taskService;
	
	@PostMapping(value="/tasks")
	public ResponseEntity<Object> saveTask(@RequestBody TaskRequest task)
	{
		System.out.println(task);
		ResponseEntity<Object> response=taskService.saveTask(task);
		return response;
	}
	
	@SuppressWarnings("null")
	@GetMapping(value ="/tasks")
	public ResponseEntity<Object> getTaskDetails()
	{
		List<Task> tasksList = taskService.getTaskDetails();
		if(tasksList !=null || !tasksList.isEmpty())
		{
			@SuppressWarnings("unused")
			ResponseEntity<Object> response = new ResponseEntity<Object>(tasksList,HttpStatus.OK);
		}
		ResponseEntity<Object> response = new ResponseEntity<Object>("{\"status\": \"No data found. \"}",HttpStatus.OK);
		return response;
 	}
}
