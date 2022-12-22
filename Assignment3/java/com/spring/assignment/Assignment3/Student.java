package com.spring.assignment.Assignment3;

import java.util.List;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Student {

	private String studentId;
	private String studentName;
	private List<Test> studentTests;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Test> getStudentTest() {
		return studentTests;
	}
	public void setStudentTest(List<Test> studentTests) {
		this.studentTests = studentTests;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName
				+ "]";
	}
}
