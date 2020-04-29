package com.sd.test;

import com.sd.program.Employee;

public class NormalClient {
	public static void main(String[] args) {
		//Traditional/Conventional way of creating Object
		//Object Construction | done by developper
		Employee eRef = new Employee();
		eRef.eId=101;
		eRef.eName="Saumen";
		eRef.eAddress="Contai";
		eRef.eGender='M';
		System.out.println(eRef);

	}
}
