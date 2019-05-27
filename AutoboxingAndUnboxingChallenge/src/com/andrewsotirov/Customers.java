package com.andrewsotirov;

import java.util.ArrayList;

public class Customers {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customers(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double transactionAmount){
        transactions.add(transactionAmount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
