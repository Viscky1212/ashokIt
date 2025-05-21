package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "std_tbl")
@Data

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String name;
	private String prise;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrise() {
		return prise;
	}
	public void setPrise(String prise) {
		this.prise = prise;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", prise=" + prise + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPrise()=" + getPrise() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
