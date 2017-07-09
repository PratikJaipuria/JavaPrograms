package com.company;
import java.util.ArrayList;
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts; // = new ArrayList<Contact>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact alreay on File!!");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (int i=0; i < myContacts.size(); i++){
            System.out.println((i+1) + "." +
                                this.myContacts.get(i).getName() + " -> " +
                                this.myContacts.get(i).getPhone());
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int findPosition = this.findContact(oldContact);
        if (findPosition <= 0 ){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        myContacts.set(findPosition,newContact);
        System.out.println(oldContact.getName() + " was updated with "+ newContact.getName());
        return true;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int findPosition = findContact(name);
        if (findPosition >= 0){
                return myContacts.get(findPosition);
        }
        return null;
    }


    public boolean removeContact(Contact contact){
        if (findContact(contact) < 0){
            System.out.println(contact.getName() + " was not found!!");
            return false;
        }
        this.myContacts.remove(contact);
        System.out.println(contact.getName() + " was deleted ");
        return true;

    }


    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }


    private int findContact(String contactName){
        for (int i = 0 ; i < this.myContacts.size() ; i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }



}
