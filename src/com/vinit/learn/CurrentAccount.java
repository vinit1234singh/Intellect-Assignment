package com.vinit.learn;

public class CurrentAccount extends Bank_Account {
	
	private static final double PENALTY_AMOUNT = 10.0;

	CurrentAccount(String acc_num, String name) {
		super(acc_num, name);
	}
	public void deductPenalty() {
		money = money-PENALTY_AMOUNT;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_Account currentAccount = new CurrentAccount("1234567890", "John Doe");
        currentAccount.deposit(1000);
        ((CurrentAccount) currentAccount).deductPenalty();
        System.out.println(currentAccount.getBalance());

	}

}
