package com.javaLecture;

import java.util.Scanner;

public class AccountApp {
    static Scanner sc =  new Scanner(System.in);
    static Account[] accountList = new Account[1000];
    static int accCount = 0;

    public static void main(String[] args) {
        int selectedMenu;

        do {
            System.out.println("1. create account\n" +
                    "2. check balance\n" +
                    "3. deposit\n" +
                    "4. withdraw\n" +
                    "5. checkLast transaction\n" +
                    "6. exit\n");

            selectedMenu = sc.nextInt();

            switch (selectedMenu) {
                case 1:
                    accountCreateFunctionality();
                    break;
                case 2:
                    checkBalanceFunctionality();
                    break;
                case 3:
                    depositFunctionality();
                    break;
                case 4:
                    withdrawFunctionality();
                    break;
                case 5:
                    viewTransactionFunctionality();
                    break;
            }
        }
        while (selectedMenu != 6);
    }

    private static void viewTransactionFunctionality() {
        sc.nextLine();
        System.out.println("Enter your Account ID: ");
        String accId = sc.nextLine();
        Account account = findAccountById(accId);

        System.out.print("Your last transaction type: ");
        System.out.print(account.getLastTransactionType());
        System.out.print("\nYour last transaction Amount: ");
        System.out.println(account.getLastTransaction());
    }

    private static void withdrawFunctionality() {
        sc.nextLine();
        System.out.println("Enter your Account ID: ");
        String accId = sc.nextLine();
        Account account = findAccountById(accId);

        System.out.println("Enter Amount to Withdraw: ");
        double wAm = sc.nextDouble();
        account.withdraw(wAm);
    }

    private static void depositFunctionality() {
        sc.nextLine();
        System.out.println("Enter your Account ID: ");
        String accId = sc.nextLine();
        Account account = findAccountById(accId);

        System.out.println("Enter Amount to Deposit: ");
        double am = sc.nextDouble();
        account.deposit(am);
    }

    private static void accountCreateFunctionality() {
        sc.nextLine();
        System.out.println("Enter Account Holder Name: ");
        String cName = sc.nextLine();
        System.out.println("Enter Account ID: ");
        String cId = sc.nextLine();
        System.out.println("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        Account account = new Account(cName, cId, bal);

        accountList[accCount] = account;

        accCount = accCount + 1;
    }

    private static void checkBalanceFunctionality() {
        sc.nextLine();
        System.out.println("Enter your Account ID: ");
        String accId = sc.nextLine();
        Account account = findAccountById(accId);

        if (account != null) {
            System.out.print("Your Current Account balance: ");
            System.out.println(account.getBalance());
        }
        else {
            System.err.println("Account Doesn't Exists!!!");
        }
    }

    private static Account findAccountById(String id) {
        for (int i = 0; i < accountList.length; i++) {
            if (accountList[i] != null && accountList[i].getCustomerID().equals(id)) {
                return accountList[i];
            }
        }
        return null;
    }
}
