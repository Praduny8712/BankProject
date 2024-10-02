package userinterface;

import entity.Account;
import operation.AccountOperation;
import validation.AccountValidation;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account();
		Account account1 = new Account();
		AccountOperation accountOperation = new AccountOperation();
		AccountValidation accountValidation = new AccountValidation();

		int ch;
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("||========================||");
			System.out.println("||=====PATIL BANK=========||");
			System.out.println("||========================||");
			System.out.println("|| 1 . Accpect details    ||");
			System.out.println("|| 2 . Display details    ||");
			System.out.println("|| 3 . Withdraw Amount    ||");
			System.out.println("|| 4 . Depsit Amount      ||");
			System.out.println("|| 5 . Transfer Amount    ||");
			System.out.println("|| 6 . Check Balance      ||");
			System.out.println("|| 7 . Upadate Balance    ||");
			System.out.println("|| 8 . Exit               ||");
			System.out.println("============================");

			System.out.println("Enter your choice= ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("===============================================");
				System.out.println(" Enetr  account number ,account holder name ,account balance");
				int accNo = sc.nextInt();
				String accHolderName = sc.next();
				double balance = sc.nextDouble();
				boolean result4 = accountValidation.checkAll(accNo, accHolderName, balance);
				if (result4 == true) {
					System.out.println("all is valid...!!");
					account.setAccNo(accNo);
					account.setAccHolderName(accHolderName);
					account.setBalance(balance);
					
				} else {
					System.out.println("invalid input...!!");
				}

				System.out.println("===============================================");
				break;
			case 2:
				System.out.println("===============================================");
				System.out.println("Displaying details");
				System.out.println("Account number= " + account1.getAccNo());
				System.out.println("Account Name= " + account1.getAccHolderName());
				System.out.println("Account Balance= " + account1.getBalance());
				System.out.println("===============================================");
				break;
			case 3:
				System.out.println("===============================================");
				System.out.println("Enter the Amount Withdraw.......");
				double amount = sc.nextDouble();
				boolean result = accountOperation.withdraw(account1, amount);
				if (result == true) {
					System.out.println("Withdraw is successful.......Thanku-you!!");
					System.out.println("The New Balance is  " + account1.getBalance());
				} else {
					System.out.println("Withdraw is failed.......Thanku-you!!");
				}
				System.out.println("===============================================");
				break;
			case 4:
				System.out.println("===============================================");
				System.out.println("Enter the Depsit Amount");
				double amount1 = sc.nextDouble();
				boolean result1 = accountOperation.deposit(account1, amount1);
				if (result1 == true) {
					System.out.println("Depsit is successful.......Thanku-you!!");
					System.out.println("The New Balance is  " + account1.getBalance());
				} else {
					System.out.println("Depsit is failed.......Thanku-you!!");
				}
				System.out.println("===============================================");
				break;
			case 5:
				System.out.println("===============================================");	
				System.out.println(" Enetr  account number ,account holder name ,account balance");
				 accNo = sc.nextInt();
			     accHolderName = sc.next();
				 balance = sc.nextDouble();
				 result4 = accountValidation.checkAll(accNo, accHolderName, balance);
				if (result4 == true) {
					System.out.println("all is valid...!!");
					account1.setAccNo(accNo);
					account1.setAccHolderName(accHolderName);
					account1.setBalance(balance);
					
				} else {
					System.out.println("invalid input...!!");
				}

				System.out.println("===============================================");
				System.out.println(" Enter the Transfer Amount");
				double amount2 = sc.nextDouble();
				System.out.println("account old Balance is  " + account.getBalance());
				System.out.println("account1 old Balance is  " + account1.getBalance());
				System.out.println("===============================================");
				boolean result3 = accountOperation.transfer(account, account1, amount2);
				if (result3 == true) {
					System.out.println("Transfer is successful.......Thanku-you!!");
					System.out.println("account New Balance is  " + account.getBalance());
					System.out.println("account1 New Balance is  " + account1.getBalance());
				} else {
					System.out.println("Transfer is failed.......Thanku-you!!");
				}
				System.out.println("===============================================");
				break;
			case 6:
				System.out.println("===============================================");
				System.out.println("Enter Account No:");
				int accno = sc.nextInt();
				if (accno == 1) {
					System.out.println("Balance for account1:" + account.getBalance());
				} else if (accno == 2) {

					System.out.println("Balance for account2:" + account1.getBalance());
				} else {
					System.out.println("Account Not found");
				}
				System.out.println("===============================================");
				break;
			case 7:
				System.out.println("===============================================");
				System.out.println("Enter Account No for change Balance:");
				accno = sc.nextInt();
				if (accno == 1) {
					System.out.println("Enter new Balance");
					amount = sc.nextDouble();
					account1.setBalance(amount);
					System.out.println("Updating Balance " + account1.getBalance());
				} else if (accno == 2) {
					System.out.println("Enter new Balance");
					amount = sc.nextDouble();
					account1.setBalance(amount);
					System.out.println("Updating Balance " + account1.getBalance());
				} else {
					System.out.println("Account Not found");
				}
				break;
			case 8:
				System.exit(0);
				System.out.println("Thank-You......");
				break;
			}
			System.out.println("do you want continus...?(yes/no)");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("yes"));
		System.out.println("Thank-You......");
	}

}
