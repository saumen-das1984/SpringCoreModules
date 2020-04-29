package com.sd.multiple.bean.configuration.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sd.autowire.examples.normal.Hostel;
import com.sd.autowire.examples.normal.Student;

public class MultipleArgumentApplicationContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentbean.xml", "hostelbean.xml");
		
		Student studentRef = (Student) context.getBean("student");
		System.out.println("Student Details : "+studentRef);
		
		Hostel hostelRef = (Hostel) context.getBean("hostel");
		System.out.println("Hostel Details : "+hostelRef);
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) context;
		ctx.close();
	}
}
