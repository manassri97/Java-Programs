package com.student.main;

import java.util.Scanner;

import com.student.modify.StudentModify;

public class MainMenu {

	private static StudentModify sm=new StudentModify();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		showMenu();
	}
	
	private static void showMenu() {
		int choice;
		int ask;
		

		while(true)
		{
		System.out.println("enter 1 to add student details");
		System.out.println("enter 2 to show student details by roll number");
		System.out.println("enter 3 to display all students details");
		System.out.println("enter 4 to exit");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:if(sm.addStudent());
				break;
		case 2:System.out.println("enter the roll number");
				ask=sc.nextInt();
				System.out.println(sm.showByRollNo(ask));
				break;
		case 3:System.out.println(sm.showStudents());
				break;
		case 4:System.exit(0);
				break;
		default:System.out.println("entered wrong choice");
		}		
		}
	}
	

}
