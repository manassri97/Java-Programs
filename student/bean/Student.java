package com.student.bean;

public class Student {

	private int rollno;
	private String name;
	private Course[] course;
	
	public Student(int rollno, String name, Course[] course) {
		super();
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	
	public int getRollNumber() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public Course[] getCourse() {
		return course;
	}
	
	public void setRollNumber(int rollno) {
		this.rollno=rollno;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setCourse(Course[] course)
	{
		this.course=course;
	}
}