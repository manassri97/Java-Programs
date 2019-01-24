package com.student.modify;

import java.util.Scanner;
import com.student.bean.Course;
import com.student.bean.Student;

public class StudentModify {

	private static Scanner sc=new Scanner(System.in);
	private Student[] student=new Student[10];
    private int counter;
	
	public String showByRollNo(int ask) {
		int i=0,j=0;
		String output="";
		for(i=0;i<student.length && student[i]!=null;i++)
		{
			if(ask==student[i].getRollNumber())
			{
				output+="Roll Number : "+student[i].getRollNumber()+" Student Name : "+student[i].getName()+"\n";
				output+="Course Id"+"\t"+"Course Name"+"\n";
			
				for(j=0;j<student[i].getCourse().length;j++)
				{
					output+=student[i].getCourse()[j].getCourseId()+" \t\t "+student[i].getCourse()[j].getCourseName()+"\n";
				}
				return output;
			}
		}
		return "Id doesnot exist";
	}

	public String showStudents() {
		int i=0,j=0;
		String output="";
		for(i=0;i<student.length && student[i]!=null;i++)
		{
				output+="Roll Number : "+student[i].getRollNumber()+" Student Name : "+student[i].getName()+"\n";
				output+="Course Id"+"\t"+"Course Name"+"\n";
			
				for(j=0;j<student[i].getCourse().length;j++)
				{
					output+=student[i].getCourse()[j].getCourseId()+" \t\t "+student[i].getCourse()[j].getCourseName()+"\n";
				}
		}
		return output;
	}
	
	public boolean addStudent() {
		System.out.println("enter roll number");
		int rollno=sc.nextInt();
		for(int i=0;i<student.length && student[i]!=null;i++)
		{
			if(rollno==student[i].getRollNumber())
				return false;
		}
		System.out.println("enter name");
		String name=sc.next();
		sc.nextLine();
		System.out.println("enter number of courses");
		int noofcourses=sc.nextInt();
		String courseId;
		String courseName;
		Course[] course=new Course[noofcourses];
		for(int i=0;i<noofcourses;i++)
		{
			System.out.println("enter course id");
			courseId=sc.next();
			sc.nextLine();
			System.out.println("enter course name");
			courseName=sc.next();
			sc.nextLine();
			Course obj=new Course(courseId,courseName);
			course[i]=obj;
		}
		student[counter++]=new Student(rollno,name,course);
		System.out.println("details addedd successfully");
		return true;
	}
}