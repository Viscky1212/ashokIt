package com.example.pojo;

import lombok.Data;

@Data
public class Passanger {
	
	private String name;
	
	private String from;
	
	private String to;
	
	private String gender;
	
	private Address addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Passanger [name=" + name + ", from=" + from + ", to=" + to + ", gender=" + gender + ", addr=" + addr
				+ ", getName()=" + getName() + ", getFrom()=" + getFrom() + ", getTo()=" + getTo() + ", getGender()="
				+ getGender() + ", getAddr()=" + getAddr() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
