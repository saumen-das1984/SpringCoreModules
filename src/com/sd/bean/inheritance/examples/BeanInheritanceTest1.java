package com.sd.bean.inheritance.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceTest1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beaninheritance1.xml"); // Spring Containner - parse XML File and Construct Object
		
		Father fatherRef = (Father) context.getBean("father");
		Father childRef = (Father) context.getBean("child");
		
		System.out.println("Father 1 Details : "+fatherRef);
		System.out.println("Child 1 Details : "+childRef);
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) context;  //Downcasting
		ctx.close();
	}
}
