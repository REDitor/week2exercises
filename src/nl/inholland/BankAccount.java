package nl.inholland;

public class BankAccount {
    private int accountNumber;
    private double balance = 200.00;

    public void withdrawCash(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance...");
        }
        else if (amount < 0) {
            System.out.println("It is not allowed to withdraw a negative amount");
        }
        else {
            balance -= amount;
        }
        //don't have to check for == 0 because that's already in the main program
    }

    public double getBalance() {
        return balance;
    }
}
