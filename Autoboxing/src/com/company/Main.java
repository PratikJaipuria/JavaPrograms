package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Union Bank of India");
        bank.addBranch("Yavatmal");

        bank.addCustomer("Yavatmal", "Pratik",5000.50);
        bank.addCustomer("Yavatmal", "Rahul",25025.50);
        bank.addCustomer("Yavatmal", "Paresh",500.75);

        bank.addBranch("Nagpur");
        bank.addCustomer("Nagpur","Anurag",25000.75);

        bank.addCustomerTransaction("Yavatmal","Pratik",2500.25);


        bank.listCustomers("Yavatmal",true);

    }
}
