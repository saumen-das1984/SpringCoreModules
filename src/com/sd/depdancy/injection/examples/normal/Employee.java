package com.sd.depdancy.injection.examples.normal;

public class Employee {
	public String eName;
	public int eId;
	Address address;
	
	public Employee()
	{
		eName="Saumen";
		eId=101;
		address = new Address(); //HAS-A relation ship as Employee has an address 
		//Employee HAS-A dependency on Address
		//Construction of Address Object is highly coupled with creation of Employee Object
		//Construction of Address Object is dependent on creation of Employee Object
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eId=" + eId + ", address=" + address + "]";
	}
	
	public static void main(String[] args) {
		Employee eRef = new Employee();
		System.out.println(eRef);
		eRef.eId=102;
		eRef.eName="Raj";
		Address addr = new Address();
		addr.city = "Howrah";
		addr.country = "India";
		addr.zipcode = "720001";
		eRef.address = addr;
		System.out.println(eRef);
		
	}
}
