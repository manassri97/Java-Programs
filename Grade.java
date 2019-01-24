package com.capgemini.assign;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the grade");
		int grade=sc.nextInt();
		if(grade<50)
		{
			System.out.println("Failed");
		}
		else if(grade>=60 && grade<=74)
		{
			System.out.println("First Division");
		}
		else
			System.out.println("Distinction");
	}

}
