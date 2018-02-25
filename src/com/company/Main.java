package com.company;

import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Account account = new Account();
        boolean quit = false;
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter balance:");
        double balance = scanner.nextDouble();
        while (!quit){
            account.printOptions();
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    System.out.println("Exiting Bank......");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter deposit amount:");
                    double amount = scanner.nextDouble();
                    account.deposit(amount,balance,customerName);
                    balance += amount;
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount  ");
                    double withdrawal = scanner.nextDouble();
                    account.withdraw(withdrawal,balance,customerName);
                    if (balance - withdrawal < 0){
                        break;
                    }else {
                        balance -= withdrawal;

                    }
                    break;
                case 3:
                    account.printOptions();
                    break;

                case 4:
                    System.out.println(customerName +"s balance is $" + balance);
                    break;
                default:
                    System.out.println("Oops! There was no option for the number " + action +
                            ". (All actions are from 1 to 4.");
            }
        }
    }
}
