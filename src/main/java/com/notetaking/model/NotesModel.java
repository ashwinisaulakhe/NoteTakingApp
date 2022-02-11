package com.notetaking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="task_table")
public class NotesModel {

	
	@task_id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int task_id;
	
	@Column(name="task_assigine",nullable=false)
	private String task_assigine;
	
	@Column(name="expected_time",nullable=false)
	private String expected_time;
	
	
	public NotesModel() {
		super();
	}
	
	public NotesModel(int task_id, String task_assigine, String expected_time) {
		super();
		this.task_id = task_id;
		this.task_assigine = task_assigine;
		this.expected_time = expected_time;
	}

	
	@Override
	public String toString() {
		return "NotesModel [task_id=" + task_id + ", task_assigine=" + task_assigine + ", expected_time="
				+ expected_time + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		long result = 1;
		result = prime * result + ((expected_time == null) ? 0 : expected_time.hashCode());
		result = prime * result + ((task_assigine == null) ? 0 : task_assigine.hashCode());
		result = prime * result + task_id;
		return (int) result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotesModel other = (NotesModel) obj;
		if (expected_time == null) {
			if (other.expected_time != null)
				return false;
		} else if (!expected_time.equals(other.expected_time))
			return false;
		if (task_assigine == null) {
			if (other.task_assigine != null)
				return false;
		} else if (!task_assigine.equals(other.task_assigine))
			return false;
		if (task_id != other.task_id)
			return false;
		return true;
	}

	public long getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getTask_assigine() {
		return task_assigine;
	}

	public void setTask_assigine(String task_assigine) {
		this.task_assigine = task_assigine;
	}

	public String getExpected_time() {
		return expected_time;
	}

	public void setExpected_time(String expected_time) {
		this.expected_time = expected_time;
	}
	
	
}
