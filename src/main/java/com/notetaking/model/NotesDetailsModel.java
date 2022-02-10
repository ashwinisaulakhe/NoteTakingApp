package com.notetaking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class NotesDetailsModel {
	
	public @interface task_Details_Id {

	}
	@task_Details_Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int task_Details_Id;
	private String task_Discription;
	private String actual_Duration;
	
	public NotesDetailsModel() {
		super();
	}

		public NotesDetailsModel(int task_Details_Id, String task_Discription, String actual_Duration) {
		super();
		this.task_Details_Id = task_Details_Id;
		this.task_Discription = task_Discription;
		this.actual_Duration = actual_Duration;
	}



	@Override
	public String toString() {
		return "NotesDetailsModel [Task_Details_Id=" + task_Details_Id + ", task_Discription=" + task_Discription
				+ ", actual_Discription=" + actual_Duration + "]";
	}

	public int getTask_Details_Id() {
		return task_Details_Id;
	}

	public void setTask_Details_Id(int task_Details_Id) {
		this.task_Details_Id = task_Details_Id;
	}

	public String getTask_Discription() {
		return task_Discription;
	}

	public void setTask_Discription(String task_Discription) {
		this.task_Discription = task_Discription;
	}

	public String getActual_Discription() {
		return actual_Duration;
	}

	public void setActual_Discription(String actual_Discription) {
		this.actual_Duration = actual_Discription;
	}
	
}
