package com.notetaking.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TaskDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int taskDetailsId;
	
	@Column(nullable = false)
	private String taskDiscription;
	
	@Column(nullable = false)
	private String actualDuration;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="taskId", nullable = false)
	@JsonIgnore
	Task task;
	
	public TaskDetails()
	{
		
	}

	public TaskDetails(int taskDetailsId, String taskDiscription, String actualDuration, Task task) {
		super();
		this.taskDetailsId = taskDetailsId;
		this.taskDiscription = taskDiscription;
		this.actualDuration = actualDuration;
		this.task = task;
	}

	public int getTaskDetailsId() {
		return taskDetailsId;
	}

	public void setTaskDetailsId(int taskDetailsId) {
		this.taskDetailsId = taskDetailsId;
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

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TaskDetails [taskDetailsId=" + taskDetailsId + ", taskDiscription=" + taskDiscription
				+ ", actualDuration=" + actualDuration + ", task=" + task + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actualDuration == null) ? 0 : actualDuration.hashCode());
		result = prime * result + ((task == null) ? 0 : task.hashCode());
		result = prime * result + taskDetailsId;
		result = prime * result + ((taskDiscription == null) ? 0 : taskDiscription.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskDetails other = (TaskDetails) obj;
		if (actualDuration == null) {
			if (other.actualDuration != null)
				return false;
		} else if (!actualDuration.equals(other.actualDuration))
			return false;
		if (task == null) {
			if (other.task != null)
				return false;
		} else if (!task.equals(other.task))
			return false;
		if (taskDetailsId != other.taskDetailsId)
			return false;
		if (taskDiscription == null) {
			if (other.taskDiscription != null)
				return false;
		} else if (!taskDiscription.equals(other.taskDiscription))
			return false;
		return true;
	}
	
}
