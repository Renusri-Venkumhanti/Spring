package com.spring.assignment.Assignment3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		AbstractApplicationContext cntx = new ClassPathXmlApplicationContext("configuration.xml");

		Test test1 = (Test) cntx.getBean("test1");

		Test test2 = (Test) cntx.getBean("test2");

		Student student1 = (Student) cntx.getBean("student1");
		List<Test> testOfStudent1 = new ArrayList<Test>();
		testOfStudent1.add(test1);
		testOfStudent1.add(test2);
		student1.setStudentTest(testOfStudent1);

		Student student2 = (Student) cntx.getBean("student2");
		List<Test> testOfStudent2 = new ArrayList<Test>();
		testOfStudent2.add(test1);
		student2.setStudentTest(testOfStudent2);

		System.out.println("Student1 Details: " + student1 + student1.getStudentTest());

		System.out.println("Student2 Details: " + student2 + student2.getStudentTest());
	}
}
