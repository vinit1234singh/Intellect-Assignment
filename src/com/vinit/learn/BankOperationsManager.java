package com.vinit.learn;


public class BankOperationsManager {
    private static BankOperationsManager instance;
    
    // Private constructor to prevent instantiation from outside
    private BankOperationsManager() {
        // Initialize any necessary resources or data structures
    }
    
    // Static method to get the singleton instance
    public static BankOperationsManager getInstance() {
        if (instance == null) {
            synchronized (BankOperationsManager.class) {
                if (instance == null) {
                    instance = new BankOperationsManager();
                }
            }
        }
        return instance;
    }
    
    // Method to open a new account
    public void openNewAccount(String accountHolder, String accountType) {
        // Business logic to open a new account
        System.out.println("Opened a new " + accountType + " account for " + accountHolder);
    }
    
    // Method to close an account
    public void closeAccount(String accountNumber) {
        // Business logic to close an account
        System.out.println("Closed account " + accountNumber);
    }
    
    // Method to deposit into an account
    public void deposit(String accountNumber, double amount) {
        // Business logic to deposit into an account
        System.out.println("Deposited " + amount + " into account " + accountNumber);
    }
    
    // Method to withdraw from an account
    public void withdraw(String accountNumber, double amount) {
        // Business logic to withdraw from an account
        System.out.println("Withdrawn " + amount + " from account " + accountNumber);
    }
    
        public static void main(String[] args) {
            // Get the singleton instance of BankOperationsManager
            BankOperationsManager manager = BankOperationsManager.getInstance();
            
            // Open new accounts
            manager.openNewAccount("John Doe", "Savings");
            manager.openNewAccount("Jane Smith", "Checking");
            
            // Perform transactions
            manager.deposit("1234567890", 1000);
            manager.withdraw("1234567890", 500);
            
            // Close an account
            manager.closeAccount("9876543210");
        
    }

}

