package com.andrewsotirov;

public class Contacts {

    private String contactNumber;
    private String contactName;

    public Contacts(String contactNumber, String contactName) {
        this.contactNumber = contactNumber;
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return (this.getContactName() + " " + this.getContactNumber());
    }

}
