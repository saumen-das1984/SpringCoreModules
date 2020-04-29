package com.sd.program;

public class Employee {
	
	//Attributeds
	public int eId;
	public String eName;
	public String eAddress;
	public char eGender;
	
	//Getter and Setter
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public char geteGender() {
		return eGender;
	}

	public void seteGender(char eGender) {
		this.eGender = eGender;
	}


	//Methods
	public Employee()
	{
		System.out.println("Employee Objects are constructed");
	}
	
	public Employee(int eId, String eName, String eAddress, char gender) {
		this.eId = eId;
		this.eName = eName;
		this.eAddress = eAddress;
		this.eGender = gender;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + ", gender=" + eGender + "]";
	}
	

	public static void main(String[] args) {
		//Traditional way fo creating Object
		//Object Construction done by developper
		Employee eRef = new Employee();
		eRef.eId=101;
		eRef.eName="Saumen";
		eRef.eAddress="Contai";
		eRef.eGender='M';
		System.out.println(eRef);

	}
	
	public void myInit()
	{
		System.out.println("Employee Objects are initialised");
	}
	
	public void myDestroy()
	{
		System.out.println("Employee Objects are destroyed");
	}

}
