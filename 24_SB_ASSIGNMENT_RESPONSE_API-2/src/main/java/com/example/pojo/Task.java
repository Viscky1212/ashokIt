package com.example.pojo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;

@Entity
@Table(name = "task_data")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskId;
	
	private String taskName;
	private Date date;
	private String time;
	
//	@ManyToMany
//	@Column(name = "user_id")
//	private UserRegistration userRegistration;
	
	@ManyToMany
	@JoinTable(
	    name = "task_user_mapping",
	    joinColumns = @JoinColumn(name = "task_id"),
	    inverseJoinColumns = @JoinColumn(name = "user_id")
	)
	private List<UserRegistration> userRegistrations;

	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updatedDate;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

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

	public List<UserRegistration> getUserRegistrations() {
		return userRegistrations;
	}

	public void setUserRegistrations(List<UserRegistration> userRegistrations) {
		this.userRegistrations = userRegistrations;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", date=" + date + ", time=" + time
				+ ", userRegistrations=" + userRegistrations + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", getTaskId()=" + getTaskId() + ", getTaskName()=" + getTaskName() + ", getDate()="
				+ getDate() + ", getTime()=" + getTime() + ", getUserRegistrations()=" + getUserRegistrations()
				+ ", getCreatedDate()=" + getCreatedDate() + ", getUpdatedDate()=" + getUpdatedDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
