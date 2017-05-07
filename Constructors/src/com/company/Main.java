package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount aliceaccount = new BankAccount();
        aliceaccount.withdrawal(100);
        aliceaccount.deposit(100);
        aliceaccount.withdrawal(80);

        BankAccount bob = new BankAccount("A1234",0.0,"Bob Marley","bob@marley.com","(617) - 642 0493");

        System.out.println(aliceaccount.getBalance());



        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bobby",25000.00);
        System.out.println(person2.getName());


        VipCustomer person3 = new VipCustomer("Pratik",2578963.00,"jaipuriapratik@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAdress());
    }
}
