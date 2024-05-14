package com.vinit.learn;

public class Saving_Account extends Bank_Account {
	
	
	

	Saving_Account(String acc_num, String name) {
		super(acc_num, name);
		// TODO Auto-generated constructor stub
	}
	public void CalculateIntrest() {
		money = money + money*0.03;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saving_Account savingAccount = new Saving_Account("1234567890","Jane Smith");
		
		savingAccount.deposit(1000);
		savingAccount.CalculateIntrest();
		System.out.println("Balance:- " +savingAccount.getBalance()); 
		
		
		
		

	}

}
