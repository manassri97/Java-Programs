package lab4_1.personaccount;

import lab4_1.person.Person;
import lab4_1.person.Person.type;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	private type t;
	
	public Account(long accNum, double balance,Person acc,type t) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder=acc;
		this.t=t;
	}

	public type getT() {
		return t;
	}

	public void setT(type t) {
		this.t = t;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
			return accHolder;
	}

	public void setAccHolder(Person acc) {
			this.accHolder = acc;
	}
}