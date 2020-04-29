package com.sd.depdancy.injection.examples.spring;

public class Employee {
	String ename;
	int eid;
	Address eAddress;
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}


	public Address geteAddress() {
		return eAddress;
	}

	//Setter Injection
	public void seteAddress(Address eAddress) {
		this.eAddress = eAddress;
	}

	//Constructor Injection
	public Employee(Address eAddress) {
		this.eAddress = eAddress;
	}

	// Methods
	public Employee() {
		System.out.println("Employee Objects are constructed");
	}
	
	public void myInit()
	{
		System.out.println("Employee Objects are initialised");
	}
	
	public void myDestroy()
	{
		System.out.println("Employee Objects are destroyed");
	}

	@Override
	public String toString() {
		return "Employee [enmae=" + ename + ", eid=" + eid + ", eAddress=" + eAddress + "]";
	}

}
