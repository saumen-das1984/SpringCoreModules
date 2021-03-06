package com.sd.depdancy.injection.examples.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClientApplicationContext {
	//Spring way | IOC (Inversion of Control)
			public static void main(String[] args) {
				ApplicationContext context = new ClassPathXmlApplicationContext("empbean1.xml"); // Spring Containner - parse XML File and Construct Object
				
				Employee eRef1 = (Employee) context.getBean("emp1");
				Employee eRef2 = context.getBean("emp2",Employee.class);
				
				System.out.println("Employee 1 Details : "+eRef1);
				System.out.println("Employee 1 Details : "+eRef2);
				
				ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) context;  //Downcasting
				ctx.close();
			}
}
