package com.sd.autowire.examples.normal;

public class Student {
	private String name;
	private String id;
	private Hostel hostel;
	
	//by constructor
	public Student(String name, String id, Hostel hostel) {
		this.name = name;
		this.id = id;
		this.hostel = hostel;
	}
	
	public Student()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", hostel=" + hostel + "]";
	}
	
}
