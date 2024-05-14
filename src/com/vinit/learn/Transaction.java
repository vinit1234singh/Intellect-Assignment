abstract class Transaction {
    protected BankAccount account;
    protected double amount;

    public Transaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public abstract void execute();

    public abstract void undo();
}

class DepositTransaction extends Transaction {
    public DepositTransaction(BankAccount account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void undo() {
        account.withdraw(amount);
    }
}

class WithdrawalTransaction extends Transaction {
    public WithdrawalTransaction(BankAccount account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void undo() {
        account.deposit(amount);
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "John Doe");
        Transaction deposit = new DepositTransaction(account, 500);
        deposit.execute();
        System.out.println(account.getBalance()); // Expected output: 500.0
    }
}
