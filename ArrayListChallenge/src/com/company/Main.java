package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilephone = new MobilePhone("617-642-0493");
    public static void main(String[] args) {
        boolean breakLoop = true;
        while (breakLoop){
            System.out.println("PLease enter your choice for your mobile phone:");
            System.out.println("1. Store \n 2. Modify \n 3. Remove \n 4. Print Contacts \n 5.Query Contact \n 6. Exit \r");
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    mobilephone.printContacts();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    breakLoop = false;
                    break;
                default:
                    System.out.println("Wrong Choice");

            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();

        Contact contact = Contact.createContact(name,phone);
        if (mobilephone.addNewContact(contact)){
            System.out.println("New contact added");
        }else {
            System.out.println("Contact already existed");
        }


    }

    private static void updateContact(){
        System.out.println("Enter the name to be updated");
        String name = scanner.nextLine();
        Contact existingReord = mobilephone.queryContact(name);
        if(existingReord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,phone);
        if(mobilephone.updateContact(existingReord,newContact)){
            System.out.println("Successfully updated");
        }else {
            System.out.println("Error updating");
        }

    }

    private static void removeContact(){
        System.out.println("Enter the name to be deleted");
        String name = scanner.nextLine();
        Contact existingReord = mobilephone.queryContact(name);
        if(existingReord == null){
            System.out.println("Contact not found");
            return;
        }

        if(mobilephone.removeContact(existingReord)){
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error deleting");
        }


    }

    private static void queryContact(){
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        Contact existingReord = mobilephone.queryContact(name);
        if(existingReord == null){
            System.out.println("Contact not found");
            return;
        }
            System.out.println(existingReord.getName() + " -> " + existingReord.getPhone());

    }


}


