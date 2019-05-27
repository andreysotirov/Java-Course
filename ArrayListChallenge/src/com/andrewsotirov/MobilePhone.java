package com.andrewsotirov;

import java.util.ArrayList;

public class MobilePhone {


    ArrayList<Contacts> contactsArray = new ArrayList<>();

    public void addContacts(String contactName, String contactNumber) {
        if (findContacts(contactName)) {
            System.out.println("Contact already added");
        } else {
            Contacts contacts = new Contacts(contactNumber, contactName);
            contactsArray.add(contacts);
        }
    }

    public void printContacts() {
        for (int i = 0; i < contactsArray.size(); i++) {
            System.out.println((i + 1) + ": " + contactsArray.get(i));
        }
    }

    public void removeContacts(int position) {
        contactsArray.remove(position);
    }

    public void removeContacts(String contactName) {
        for (int i = 0; i < contactsArray.size(); i++) {
            if (contactsArray.get(i).getContactName().contains(contactName)) {
                contactsArray.remove(i);
            }
        }
    }

    public boolean findContacts(String searchedContactName) {

        for (int i = 0; i < contactsArray.size(); i++) {
            if (contactsArray.get(i).getContactName().contains(searchedContactName)) {
                return true;
            }
        }
        return false;
    }

    public void updateContact(String contactName, String contactNumber) {

        if (findContacts(contactName)) {
            contactsArray.get(findIndex(contactName)).setContactNumber(contactNumber);
        } else System.out.println("Contact not found");
    }

    public int findIndex(String contactName) {
        for (Contacts contacts : contactsArray) {
            if (contacts.getContactName().equals(contactName)) {
                return contactsArray.indexOf(contacts);
            }
        }
        return -1;
    }
}
