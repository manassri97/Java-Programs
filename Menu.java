package com.capgemini.assign;

import java.util.Scanner;

public class Menu {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		showMenu();

	}
	private static void showMenu() {
		
		int ch=0,a=0,b=0,result=0;
		while(true)
		{
			System.out.println("enter 1 to add");
			System.out.println("enter 2 to sub");
			System.out.println("enter 3 to mul");
			System.out.println("enter 4 to div");
			System.out.println("enter 5 to exit");
			ch=sc.nextInt();
			 switch(ch)
			 {
			 case 1:System.out.println("enter the first number");
			 		a=sc.nextInt();
			 		System.out.println("enter the second number");
			 		b=sc.nextInt();
			 		result=a+b;
			 		System.out.println(result);
			 		break;
			 case 2:System.out.println("enter the first number");
		 			a=sc.nextInt();
		 			System.out.println("enter the second number");
		 			b=sc.nextInt();
		 			result=Math.abs(a-b);
		 			System.out.println(result);
		 			break;
			 case 3:System.out.println("enter the first number");
		 			a=sc.nextInt();
		 			System.out.println("enter the second number");
		 			b=sc.nextInt();
		 			result=a*b;
		 			System.out.println(result);
		 			break;
			 case 4:System.out.println("enter the first number");
		 			a=sc.nextInt();
		 			System.out.println("enter the second number");
		 			b=sc.nextInt();
		 			result=(int)a/b;
		 			System.out.println(result);
		 			break;
			 case 5:System.exit(0);
			 default:System.out.println("wrong choice");
			 }
		}
	}

}
