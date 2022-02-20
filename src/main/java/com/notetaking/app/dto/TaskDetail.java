package com.notetaking.app.dto;

import com.notetaking.app.entities.Task;

public class TaskDetail {

	public String taskDiscription;
	public String actualDuration;
	
	public TaskDetail() {
		super();
	}
	
	public String getTaskDiscription() {
		return taskDiscription;
	}
	
	public void setTaskDiscription(String taskDiscription) {
		this.taskDiscription = taskDiscription;
	}
	
	public String getActualDuration() {
		return actualDuration;
	}
	
	public void setActualDuration(String actualDuration) {
		this.actualDuration = actualDuration;
	}

	@Override
	public String toString() {
		return "TaskDetail [taskDiscription=" + taskDiscription + ", actualDuration=" + actualDuration + "]";
	}

	public void setTask(Task task) {
		// TODO Auto-generated method stub
		
	}

	

	
}
