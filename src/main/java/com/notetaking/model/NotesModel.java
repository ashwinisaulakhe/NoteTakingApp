package com.notetaking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class NotesModel {

	
	@task_id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int task_id;
	private String task_assigine;
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

	public int getTask_id() {
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
