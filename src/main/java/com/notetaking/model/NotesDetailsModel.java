package com.notetaking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="task_details")
public class NotesDetailsModel {
	
	public @interface task_Details_Id {

	}
	@task_Details_Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int task_Details_Id;
	
	@Column(name="task_discription",nullable=false)
	private String task_Discription;
	
	@Column(name="actual_Duration",nullable=false)
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

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actual_Duration == null) ? 0 : actual_Duration.hashCode());
		result = prime * result + task_Details_Id;
		result = prime * result + ((task_Discription == null) ? 0 : task_Discription.hashCode());
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
		NotesDetailsModel other = (NotesDetailsModel) obj;
		if (actual_Duration == null) {
			if (other.actual_Duration != null)
				return false;
		} else if (!actual_Duration.equals(other.actual_Duration))
			return false;
		if (task_Details_Id != other.task_Details_Id)
			return false;
		if (task_Discription == null) {
			if (other.task_Discription != null)
				return false;
		} else if (!task_Discription.equals(other.task_Discription))
			return false;
		return true;
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
