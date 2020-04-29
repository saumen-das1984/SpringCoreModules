package com.sd.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sd.program.Employee;

public class SpringClientBeanFactory {
	//Spring way | IOC (Inversion of Control)
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("empbean.xml");
		BeanFactory factory = new XmlBeanFactory(resource); // Spring Containner - parse XML File and Construct Object
		
		Employee eRef1 = (Employee) factory.getBean("emp1");
		Employee eRef2 = (Employee) factory.getBean("emp2");
		
		System.out.println("Employee 1 Details : "+eRef1);
		System.out.println("Employee 1 Details : "+eRef2);
	}
	
}
