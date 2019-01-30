package lab4_1.scheduler;

import java.util.Scanner;

import lab4_1.person.Person;
import lab4_1.person.Person.type;
import lab4_1.personaccount.Account;

public class BussinessScheduler {
	private static Account[] ac=new Account[10];
	private static Scanner sc=new Scanner(System.in);
	private static int count;
	static long a=127115929;
	static double bal=500;
	String output;
	public String createAccount() {
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter age");
		float age=sc.nextFloat();
		Person acc=new Person(name,age);
		System.out.println("enter type of account"+"\n"+"enter 1 for SAVING"+"\n"+"enter 2 for CURRENT");
		int t=sc.nextInt();
		if(t==1)
		{
			acc.setT(type.SAVING);
		}
		else
		{
			acc.setT(type.CURRENT);
		}
		int i=count;
		ac[count++]=new Account(a,bal,acc,acc.getT());
		a++;
		output="";
		return output+="Account created successfully"+"\n"
						+"Account number :"+ac[i].getAccNum()+"\n"
						+"Account holder name :"+ac[i].getAccHolder().getName()+"\n"
						+"Type of account :"+ac[i].getT()+"\n";
	}
	
	public String deposit() {
		System.out.println("enter account number");
		int i=0;
		output="";
		long number=sc.nextLong();
		for(i=0;i<ac.length && ac[i]!=null;i++) {
		if(number==ac[i].getAccNum())
		{
			System.out.println("enter amount");
			double amount=sc.nextDouble();
			amount+=ac[i].getBalance();
			ac[i].setBalance(amount);
			return output+="Account number :"+ac[i].getAccNum()+"\n"+"Account balance :"+ac[i].getBalance()+"\n";
		}
		}
		return output+="Wrong Account Number";
		
		
	}
}
