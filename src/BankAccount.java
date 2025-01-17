public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    protected double balance;

    public BankAccount() {
        this.firstName = "";
        this.lastName = "";
        this.accountID = 0;
        this.balance = 0.0;
    }

    public BankAccount(String firstName, String lastName, int accountID, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        try {
            if (depositAmount > 0) {
                balance = balance + depositAmount;
                System.out.println("Deposit complete. \nNew balance is: $" + balance);
            } else {
                System.out.println("Deposit must be positive, maybe a withdrawal is more appropriate.");
            }
        } catch (Exception i) {
            System.out.println("Deposit unable to be completed due to: " + i.getMessage());
        }
    }

    public void withdrawal(double withdrawalAmount) {
        try {
            if (withdrawalAmount > 0) {
                if (balance >= withdrawalAmount) {
                    balance = balance - withdrawalAmount;
                    System.out.println("Withdrawal complete. \nNew balance is: $" + balance);
                } else {
                    System.out.println("Withdrawal would exceed available funds.");
                }
            } else {
                System.out.println("Withdrawal must be positive, maybe a deposit is more appropriate.");
            }
        } catch (Exception i) {
            System.out.println("Withdrawal unable to be completed due to: " + i.getMessage());
        }
    }

    public String getFirst() {
        return firstName;
    }
    public String getLast() {
        return lastName;
    }
    public int getID() {
        return accountID;
    }
    public double getBalance() {
        return balance;
    }
    public void setFirst(String firstName) {
        this.firstName = firstName;
    }
    public void setLast(String lastName) {
        this.lastName = lastName;
    }
    public void setID(int accountID) {
        this.accountID = accountID;
    }

    public void myBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public void accountSummary() {
        System.out.println("Your account details:");
        System.out.println("First Name - " + firstName);
        System.out.println("Last Name - " + lastName);
        System.out.println("Account ID - " + accountID);
        System.out.println("Current Balance - $" + balance);
    }
}
