package com.college.model;

public class Student extends Person{
	private int studentID;
	private String department;
	private String courseName;
	
	public Student(String name,int age, long contactNumber,int studentID, String department, String courseName) {
		super(name,age,contactNumber);
		this.studentID = studentID;
		this.department = department;
		this.courseName = courseName;
	}
	
	public int getStudentID(){
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void displayDetails() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Contact: " + getContactNumber());
		System.out.println("StudentID: " + getStudentID());
		System.out.println("Department: " +getDepartment());
		System.out.println("Title: " +getCourseName());
	}
}


