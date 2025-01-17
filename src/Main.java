//Main purely used as a test environment
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //BankAccount class tests
        BankAccount account1 = new BankAccount("Michael", "Myers", 1, 0.0);
        account1.accountSummary();
        System.out.println("-------------------");
        account1.deposit(-1);
        account1.deposit(100);
        System.out.println("-------------------");
        account1.withdrawal(-1);
        account1.withdrawal(105);
        account1.withdrawal(80);
        System.out.println("-------------------");
        account1.myBalance();
        System.out.println();

        //CheckingAccount class tests
        CheckingAccount checkAccount1 = new CheckingAccount("Freddy", "Krueger", 1, 0.0, 1.5);
        checkAccount1.displayAccount();
        System.out.println("-------------------");
        checkAccount1.deposit(-1);
        checkAccount1.deposit(200);
        System.out.println("-------------------");
        checkAccount1.processWithdrawal(-1, input);
        checkAccount1.processWithdrawal(100, input);
        checkAccount1.processWithdrawal(300, input);
        System.out.println("-------------------");
        checkAccount1.myBalance();

        input.close();
    }
}