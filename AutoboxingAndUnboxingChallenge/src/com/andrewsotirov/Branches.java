package com.andrewsotirov;

import java.util.ArrayList;

public class Branches {
    private ArrayList<Customers> customers;
    private String branchName;

    public Branches(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public boolean addNewCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName) == null){
            customers.add(new Customers(customerName, initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName, double amount){
        Customers existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customers findCustomer (String customerName){
        if (customers.contains(customerName)){
            for (int i = 0; i < customers.size(); i++) {
                Customers checkedCustomer = customers.get(i);
                if (checkedCustomer.getCustomerName().equals(customerName)){
                    return checkedCustomer;
                }
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }
}
