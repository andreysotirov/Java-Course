package com.andrewsotirov;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundContact = findContact(oldContact);
        if (foundContact < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else if (findContact(newContact) != -1){
            System.out.println("Contact with that name already exists");
            return false;
        }
        myContacts.set(foundContact, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return myContacts.get(position);
        }
        return null;
    }

    public boolean removeContact(Contact contact) {
        int foundContact = findContact(contact);
        if (foundContact < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        myContacts.remove(foundContact);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    public void printContacts(){
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + "." + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}
