package com.vinit.learn;

import java.util.*;

public class Bank_Account {
    
    String Account_holder_name;
    String account_number;
    double money = 0; 
    
    Bank_Account(String acc_num, String name){
        Account_holder_name = name;
        account_number= acc_num;
    }
    
    // Method to deposit money into the account
    public void deposit(double amount) {
        money = money + amount;
    }
    
    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if(money - amount >= 0) {
            money = money - amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    // Method to get the current balance of the account
    public double getBalance() {
    	return money;
    }
    
    public static void main(String[] args) {
        Bank_Account b = new Bank_Account("1234567890", "John Doe");
        b.deposit(1000.50); 
        b.withdraw(500.75); 
        b.getBalance();
    }
}
