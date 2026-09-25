package Section13.Herança.app;

import Section13.Herança.entities.Account;
import Section13.Herança.entities.BusinessAccount;
import Section13.Herança.entities.SavingAccount;

public class Program {
    void main(){
        Account acc = new Account(1001, "Pedro", 0.0);
        BusinessAccount bAcc = new BusinessAccount(1002, "Alex", 0.0, 500.0);

        // Upcasting

        Account acc1 = bAcc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
        Account acc3 = new SavingAccount(1004, "Ana", 0.0, 0.1);

        // Downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(200.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        // Tipo incompatível para downcasting - Forma correta abaixo.

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(2000.0);
            System.out.println("Emprestimo");
        }
        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account acc6 = new Account(1001, "Pedro", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingAccount(1002, "Pedro", 1000.0, 0.1);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());
    }
}
