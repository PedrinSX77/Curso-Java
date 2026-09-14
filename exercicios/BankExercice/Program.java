import java.util.Scanner;

import entities.Account;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        Account account = new Account(accountNumber);

        System.out.println("Enter account holder: ");
        account.setHolderAccount(sc.nextLine());

        System.out.println("Is there an initial deposit (y/n)? ");
        String isInitialDeposit = sc.next().toLowerCase();

        while (!isInitialDeposit.equals("y") && !isInitialDeposit.equals("n")) {
            System.out.println("The input need to be (y/n)? ");
            isInitialDeposit = sc.next().toLowerCase();
        }

        if (isInitialDeposit.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            account.deposit(sc.nextDouble());
        }

        System.out.println("Account data:");
        System.out.println(account.toString());

        System.out.println("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account.toString());

        System.out.println("Enter a withdraw value:");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account.toString());

        sc.close();
    }
}
