package com.notetaking.app.dto;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TaskRequest {

	public String taskAssigine;
	public String expectedTime;
	@JsonFormat(pattern= "dd/mm/yyyy")
	private Date startDate;
	public ArrayList<TaskDetail> taskDetails;
	
	public TaskRequest() {
		super();
	}

	public String getTaskAssigine() {
		return taskAssigine;
	}

	public void setTaskAssigine(String taskAssigine) {
		this.taskAssigine = taskAssigine;
	}

	public String getExpectedTime() {
		return expectedTime;
	}

	public void setExpectedTime(String expectedTime) {
		this.expectedTime = expectedTime;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public ArrayList<TaskDetail> getTaskDetails() {
		return taskDetails;
	}

	public void setTaskDetails(ArrayList<TaskDetail> taskDetails) {
		this.taskDetails = taskDetails;
	}

	@Override
	public String toString() {
		return "TaskRequest [taskAssigine=" + taskAssigine + ", expectedTime=" + expectedTime + ", startDate="
				+ startDate + "]";
	}

	
}
