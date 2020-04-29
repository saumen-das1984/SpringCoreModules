package com.sd.depdancy.injection.examples.constructor;

public class Employee {
	public String eName;
	public int eId;
	Address address;

	public Employee() {
		eName = "Saumen";
		eId = 101;
		//address = new Address(); // We have removed dependency and make it loosely coupled
	}
	
	public Employee(Address addr) {
		address = addr;
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
			Employee eRef1 = new Employee(addr);
			System.out.println(eRef1);
			
		}
}
