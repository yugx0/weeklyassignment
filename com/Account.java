package com;
import java.util.*;

class Account
{  //account credential
	
	private String account_number;
	private double balance;
	private String customer_name;
	
	
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;	
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//parameterized constructor
	public Account(String account_number,String customer_name,double balance)
	{
	this.customer_name=customer_name;
	this.account_number=account_number;
	this.balance=balance;
	}
}
//Interface
interface Maintainence_charge
{
	  public float calculatemaintainencecharge(float noofyears) ;
}
//Current_account
class CurrentAccount extends Account implements Maintainence_charge
{

	public CurrentAccount(String account_number, String customer_name, double balance) {
		super(account_number, customer_name, balance);
		
		// TODO Auto-generated constructor stub
	}
	public float calculatemaintainencecharge(float noofyears) {
		int m=100;
		float n=noofyears;
		float totalcharge=(m*n)+200;
		return totalcharge;
	}
	
	
}
//Saving Account
class SavingAccount extends Account implements Maintainence_charge {

	public SavingAccount(String account_number, String customer_name, double balance) {
		super(account_number, customer_name, balance);
		// TODO Auto-generated constructor stub
	}
	public float calculatemaintainencecharge(float noofyears) {
		int m=50;
		float n=noofyears;
		float totalcharge=(m*n)+m;
		return totalcharge;
	}
	


 public class Account{
	 
	public static void main(String[] args)
	{
		String acno;
		String name;
		double bal;
		float years;
		float maint_charge;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Saving Account");
		System.out.println("2.Current Account");	
		System.out.println("Enter your choice");
		int a=sc.nextInt();
		int choice=a;
		String account_type="";
		switch(choice) {
		case 1:
		System.out.println("Enter account no");
		 acno=sc.next();
		System.out.println("Enter Customer name");
		 name=sc.next();
		System.out.println("Enter Balance");
		 bal=sc.nextDouble();
		System.out.println("Enter no. of Years");
	     years=sc.nextFloat();
	     SavingAccount saving =new SavingAccount(acno,name,bal);
	     maint_charge=saving.calculatemaintainencecharge(years);
	     System.out.println("Customer name"+saving.getCustomer_name());
	     System.out.println("Account number"+saving.getAccount_number());
	     System.out.println("Account Balance "+saving.getBalance());
	     System.out.println("Maintenance Charge for Saving Account is Rs"+maint_charge);
	     break;
		case 2:
		System.out.println("Enter account no");
		 acno=sc.next();
		System.out.println("Enter Customer name");
	    name=sc.next();
		System.out.println("Enter Balance");
		 bal=sc.nextDouble();
		System.out.println("Enter no. of Years");
	     years=sc.nextFloat();
	     CurrentAccount  current =new CurrentAccount (acno,name,bal);
	     maint_charge=current.calculatemaintainencecharge(years);
	     System.out.println("Customer name"+current.getCustomer_name());
	     System.out.println("Account number"+current.getAccount_number());
	     System.out.println("Account Balance "+current.getBalance());
	     System.out.println("Maintenance Charge for Current Account is Rs"+maint_charge);
		break;
		default:
			System.out.println("Enter Valid Choice");
		}
		//System.out.println(account_type);
		//account no;
		
		
		
		
	}
}


