package com.example.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Passanger {
	
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String doj;
	private String trainNum;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	@Override
	public String toString() {
		return "Passanger [fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to + ", doj=" + doj
				+ ", trainNum=" + trainNum + ", getFname()=" + getFname() + ", getLname()=" + getLname()
				+ ", getFrom()=" + getFrom() + ", getTo()=" + getTo() + ", getDoj()=" + getDoj() + ", getTrainNum()="
				+ getTrainNum() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
