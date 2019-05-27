package com.andrewsotirov;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        printInstructions();
        while (!quit) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        printContacts();
                        break;
                    case 2:
                        addNewContact();
                        break;
                    case 3:
                        updateContact();
                        break;
                    case 4:
                        findContact();
                        break;
                    case 5:
                        removeContact();
                        break;
                    case 6:
                        printInstructions();
                        break;
                    case 7:
                        quit = true;
                        break;
                }
            } else {
                System.out.println("Enter valid number");
            }
        }
    }


    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void updateContact() {
        System.out.println("Enter contact name to update");
        String contactName = scanner.nextLine();
        System.out.println("Enter new contact number");
        String contactNumber = scanner.nextLine();
        mobilePhone.updateContact(contactName, contactNumber);
        System.out.println("Contact updated " + contactName + " with new number " + contactNumber);
    }

    private static void findContact() {
        System.out.println("Please enter contact name to search");
        String searchedName = scanner.nextLine();
        if (mobilePhone.findContacts(searchedName)) {
            System.out.println("Contact " + searchedName + " is found.");
        } else {
            System.out.println("Contact not found");
        }
    }

    private static void removeContact() {
        System.out.println("Please enter contact name or position to remove");
        if (scanner.hasNextInt()) {
            int position = scanner.nextInt() - 1;
            mobilePhone.removeContacts(position);
            System.out.println("Contact position" + (position + 1) + " was removed");
        } else {
            String contactName = scanner.nextLine();
            mobilePhone.removeContacts(contactName);
            System.out.println("Contact name " + contactName + " was removed");

        }
    }

    private static void addNewContact() {
        System.out.print("Please enter contact name:");
        String contactName = scanner.nextLine();
        System.out.print("Please enter contact number:");
        String contactNumber = scanner.nextLine();
        mobilePhone.addContacts(contactName, contactNumber);
        System.out.println("Contact " + contactName + " with number " + contactNumber + " added.");
    }


    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To modify a contact.");
        System.out.println("\t 4 - To search for a contact.");
        System.out.println("\t 5 - To remove a contact.");
        System.out.println("\t 6 - To print choice options.");
        System.out.println("\t 7 - To quit the application.");
    }
}
