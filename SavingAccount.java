package com.account;

public class SavingAccount extends Account{

	public SavingAccount(String accountno, String accType, String name, String phno, double balance) {
	
		super(accountno, accType, name, phno, balance, 4);
		if(accountno==null && accountno.isEmpty()==true)
			throw new IllegalArgumentException("Account Number must not be null");
		if(balance < 0.0)
			throw new IllegalArgumentException("Account balance cannot be negative.");
		if(name == null && name.isEmpty())
			throw new IllegalArgumentException("Customer Name cannot be blank.");
		if(phno == null || phno.length() != 10)
			throw new IllegalArgumentException("Phone Number must be of  10-digits.");
	}
	
}
