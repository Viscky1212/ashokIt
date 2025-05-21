package com.example.exception;

import java.time.LocalDateTime;

import lombok.Data;
//binding class 
@Data
public class ExceptionInfo {
	private String code;
	private String msg;
	private LocalDateTime date;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ExceptionInfo [code=" + code + ", msg=" + msg + ", date=" + date + ", getCode()=" + getCode()
				+ ", getMsg()=" + getMsg() + ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
