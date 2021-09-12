package nl.inholland;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.printf("Balance is now: %.2f ", ba.getBalance());
        while(true) {
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an amount to withdraw or 0 to stop: ");
            double amount = scanner.nextDouble();
            if(amount == 0) {
                System.out.print("End program.....");
                break;
            }
            ba.withdrawCash(amount);
            System.out.printf("Balance is now: %.2f ", ba.getBalance());
        }
    }
}
