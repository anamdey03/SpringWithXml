package com.practice.SpringWithXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.SpringWithXml.Service.StudentService;

public class App {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
		studentService.nameStartingWithA().forEach(s -> System.out.println(s.toString()));
		applicationContext.close();
	}
}
