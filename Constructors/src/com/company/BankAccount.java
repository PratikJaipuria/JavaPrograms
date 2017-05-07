package com.company;

/**
 * Created by Pratik on 5/6/2017.
 */
public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public  BankAccount(){
        this("56789",2.50,"default name","default adress","default phine");
        System.out.println("Empty Constructor");

    }
    public BankAccount(String number,double balance, String customerName, String email, String phoneNumber){

        System.out.println("Account constructor");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdrawal(double amount){
        if(this.balance < amount){
            System.out.println("Only " + this.balance + "available, Withdrwal not processed");
        }else {
            this.balance -= amount;
            System.out.println("Withdrwal of " + amount + "was processed");
            System.out.println("Remaining balance "+ this.balance);
        }
    }

    public void setaccountNumber(String number){
        this.number = number;
    }

    public String getAccountNumber(){
        return this.number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
