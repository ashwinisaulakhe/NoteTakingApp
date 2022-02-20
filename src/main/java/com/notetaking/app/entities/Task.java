package com.notetaking.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.notetaking.app.dto.TaskDetail;
@Entity
@Table(name = "Tasks")
public class Task implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long taskId;
	
	@Column(nullable = false)
	private String taskAssigine;
	
	@Column(nullable = false)
	private String expectedTime;
	
	@Column
	private Date startDate;
	
	@OneToMany(mappedBy ="task", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<TaskDetail> taskDetails;
	
	public Task()
	{
		
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
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

	public List<TaskDetail> getTaskDetails() {
		return taskDetails;
	}

	public void setTaskDetails(List<TaskDetail> taskDetails) {
		this.taskDetails = taskDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskAssigine=" + taskAssigine + ", expectedTime=" + expectedTime
				+ ", startDate=" + startDate + ", taskDetails=" + taskDetails + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expectedTime == null) ? 0 : expectedTime.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((taskAssigine == null) ? 0 : taskAssigine.hashCode());
		result = prime * result + ((taskDetails == null) ? 0 : taskDetails.hashCode());
		result = prime * result + (int) (taskId ^ (taskId >>> 32));
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
		Task other = (Task) obj;
		if (expectedTime == null) {
			if (other.expectedTime != null)
				return false;
		} else if (!expectedTime.equals(other.expectedTime))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (taskAssigine == null) {
			if (other.taskAssigine != null)
				return false;
		} else if (!taskAssigine.equals(other.taskAssigine))
			return false;
		if (taskDetails == null) {
			if (other.taskDetails != null)
				return false;
		} else if (!taskDetails.equals(other.taskDetails))
			return false;
		if (taskId != other.taskId)
			return false;
		return true;
	}
	
}

