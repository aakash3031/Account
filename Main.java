package com.account;

public class Main {

	public static void main(String[] args) {

		Account ram=  new SavingAccount("53435353","Savings","Ram","8195017500",7890);
		Account sham=  new CurrentAccount("998709890","Current","Sham","8195007890",1100);
		System.out.println(ram);
		ram.creditAmount(500);
		System.out.println(ram.getBalance());
		ram.debitAmount(100);
		System.out.println(ram.getBalance());
		
		
		System.out.println(sham);
		sham.creditAmount(500);
		System.out.println(sham.getBalance());
		sham.debitAmount(100);
		System.out.println(sham.getBalance());
		
		
		
	}

}
