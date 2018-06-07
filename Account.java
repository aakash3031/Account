package com.account;
class ExcessAmt extends Exception
{
    public ExcessAmt(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class Account {
	
	private String account_no;
	private String account_type;
	private String name;
	private String phno;
	private double balance;
	private int rate;
	
	
	
	public Account(String accountno, String accType, String name, String phno, double balance, int rate) {
		this.account_no=accountno;
		this.account_type=accType;
		this.name=name;
		this.phno=phno;
		this.balance=balance;
		this.rate=rate;// TODO Auto-generated constructor stub
	}

	public void creditAmount(double amt) {
		balance=balance+amt;
	}

	
	public void debitAmount(double amt)  {
		if(amt>=balance)
		{
			try
	        {
	            // Throw an object of user defined exception
	            throw new ExcessAmt("Invalid Balance");
	        }
	        catch (ExcessAmt ex)
	        {
	            System.out.println(ex.getMessage());
	        }
		}
		else
		{
			balance=balance-amt;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void changeName(String name) {
		if(name!=null)
		this.name=name;
	}

	public double intersetCalculate() {
		return balance*rate/100;
	}
	
	public void setPhone(int phone)
	{
		System.out.println("Phone no. cant be changed");
	}
	public String toString() {
		return "Account No.: "+this.account_no+" Name: "+this.name+" AccountType: "+this.account_type+" Balance"+balance+" Phone Number: "+this.phno;
	}
	

}
