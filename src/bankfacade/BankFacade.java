/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<AccountIf> cust1Accounts = new ArrayList();
       AccountIf acc = new BankAccount(12345);
       acc.deposit(500);
       cust1Accounts.add(acc);
       acc = new BankAccount(12346);
       acc.deposit(1000);
       cust1Accounts.add(acc);
       CustomerIf cust1 = new BankCustomer("John", cust1Accounts);
       System.out.println("Customer and account information");
       System.out.println("Name = " + cust1.getCustomerName());
       System.out.println("Has " + cust1.getNumAccounts() + " accounts");
       acc = cust1.getAccount(12345);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       acc = cust1.getAccount(12346);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       acc.deposit(1000);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       ArrayList<AccountIf> accounts = cust1.getllAccounts();
       for(AccountIf account : accounts) {
           System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
       }
    }
    
}
