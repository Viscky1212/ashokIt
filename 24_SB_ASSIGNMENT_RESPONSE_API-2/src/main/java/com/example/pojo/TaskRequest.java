package com.example.pojo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
public class TaskRequest {
	
	private String taskName;
	private Date date;
	private String time;
	
	private UserRegistration userRegistration;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public UserRegistration getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
	}

	@Override
	public String toString() {
		return "TaskRequest [taskName=" + taskName + ", date=" + date + ", time=" + time + ", userRegistration="
				+ userRegistration + ", getTaskName()=" + getTaskName() + ", getDate()=" + getDate() + ", getTime()="
				+ getTime() + ", getUserRegistration()=" + getUserRegistration() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
