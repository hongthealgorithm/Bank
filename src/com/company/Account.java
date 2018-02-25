package com.company;

import java.util.Scanner;

public class Account {
    private static Scanner scanner = new Scanner(System.in);
    private String number;
    private double balance;
    private String customerName;
    private String phoneNumber;
    private String emailAddress;


   public void deposit(double amount ,double balance,String customerName){

       double balance1 = balance + amount;
       System.out.println(customerName + " now has $"+ balance1 + " in his or her bank account.");
   }
    public void withdraw( double amount1,double balance,String customerName){
       if (balance - amount1 <0){
           System.out.println(customerName + " only has $" + balance + " in his or her bank account. Withdrawal not processed.");

       }else {
           balance = balance - amount1;
           System.out.println("Withdrawal proceeded. " + customerName + " now has $" + balance + " in his or her bank account.");
       }

    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void printOptions(){
        System.out.println("0: To leave the bank");
        System.out.println("1: To deposit some money");
        System.out.println("2: To withdraw some money");
        System.out.println("3: To print the list of options");
        System.out.println("4: To print out your balance");



    }

}
