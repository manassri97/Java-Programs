package lab4_1.main;

import java.util.Scanner;
import lab4_1.scheduler.BussinessScheduler;

public class MainApp {
	private static Scanner sc=new Scanner(System.in);
	private static BussinessScheduler bl=new BussinessScheduler();
	public static void main(String[] args) {
		showMenu();
	}
	private static void showMenu() {
		while(true) {
			System.out.println("enter 1 to create account");
			System.out.println("enter 2 to Withdraw");
			System.out.println("enter 3 to Deposit");
			System.out.println("enter 4 to display");
			System.out.println("enter 5 to exit");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:System.out.println(bl.createAccount());
						break;
				case 2:System.out.println(bl.deposit());
				}	
			}
		}
}
