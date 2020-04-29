package com.sd.bean.inheritance.examples;

public class Father {
	
	private String firstName;
	private String surName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	@Override
	public String toString() {
		return " [firstName=" + firstName + ", surName=" + surName + "]";
	}
	
}
