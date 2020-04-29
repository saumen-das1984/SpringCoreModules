package com.sd.multiple.bean.configuration.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sd.autowire.examples.normal.Student;


public class MasterBeanApplicationContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("masterbean.xml");
		
		Student studentRef = (Student) context.getBean("student");
		System.out.println("Student Details : "+studentRef);
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) context;
		ctx.close();
	}
}
