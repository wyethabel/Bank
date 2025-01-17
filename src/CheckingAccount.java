//Special case subclass capable of overdrafting.
import java.util.Scanner;

public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount() {
        super();
        this.interestRate = 0.0;
    }

    public CheckingAccount(String firstName, String lastName, int accountID, double balance, double interestRate) {
        super(firstName, lastName, accountID, balance);
        this.interestRate = interestRate;
    }

    public double getInterest() {
        return interestRate;
    }
    public void setInterest(double interestRate) {
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double withdrawalAmount, Scanner input) {
        try {
            if (withdrawalAmount > 0) {
                if (balance >= withdrawalAmount) {
                    balance = balance - withdrawalAmount;
                    System.out.println("Withdrawal complete. \nNew balance is: $" + balance);
                } else {
                    System.out.println("An overdraft fee of $30 will be applied. Continue? (Y/N): ");
                    String userInput = input.nextLine();
                    if (userInput.equals("Y")) {
                        balance = balance - withdrawalAmount - 30.0;
                        System.out.println("Withdrawal complete. \nNew balance is: $" + balance);
                    } else {
                        System.out.println("Withdrawal cancelled");
                    }
                }
            } else {
                System.out.println("Withdrawal must be positive");
            }
        } catch (Exception i) {
            System.out.println("Withdrawal unable to be completed due to: " + i.getMessage());
        }
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Current Interest Rate - " + interestRate + "%");
    }
}
