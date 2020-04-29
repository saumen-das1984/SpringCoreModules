package com.sd.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sd.autowire.examples.normal.Student;


public class SpringClientFileSystemXMLApplictionContext {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/autowirenormal.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
		FileSystemXmlApplicationContext context1 = new FileSystemXmlApplicationContext("src/autowirebyname.xml");
		Student student1 = (Student) context1.getBean("student");
		System.out.println(student1);
		
		FileSystemXmlApplicationContext context2 = new FileSystemXmlApplicationContext("src/autowirebytype.xml");
		Student student2 = (Student) context2.getBean("student");
		System.out.println(student2);
		
		FileSystemXmlApplicationContext context3 = new FileSystemXmlApplicationContext("src/autowirebyconstructor.xml");
		Student student3 = (Student) context3.getBean("student");
		System.out.println(student3);
		
		FileSystemXmlApplicationContext context4 = new FileSystemXmlApplicationContext("src/autowirebydefault.xml");
		Student student4 = (Student) context4.getBean("student");
		System.out.println(student4);
		
		context.close();
		context1.close();
		context2.close();
		context3.close();
		context4.close();
	}
}
