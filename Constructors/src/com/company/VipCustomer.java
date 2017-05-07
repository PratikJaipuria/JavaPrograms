package com.company;

/**
 * Created by Pratik on 5/6/2017.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAdress;

    public VipCustomer(){
        this("ABC",0.0,"abc@xyz.com");
    }

    public VipCustomer(String name, double creditLimit){
        this(name,creditLimit,"none@given.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAdress){
        this.creditLimit = creditLimit;
        this.name = name;
        this.emailAdress = emailAdress;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
