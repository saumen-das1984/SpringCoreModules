package com.sd.bean.inheritance.examples;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class BeanInheritanceTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/beaninheritance.xml");
		WagnoR wagnor = (WagnoR) context.getBean("wagnor");
		System.out.println(wagnor);
		
		context.close();
	}
}
