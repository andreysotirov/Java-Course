package com.andrewsotirov;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    ArrayList<Branches> branch;

    public Bank() {
        this.bankName = "Unicredit";
        this.branch = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branch.add(new Branches(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branches branches = findBranch(branchName);
        if (branches != null) {
            return branches.addNewCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branches branches = findBranch(branchName);
        if (branches != null) {
            return branches.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branches findBranch(String branchName) {
        for (int i = 0; i < branch.size(); i++) {
            Branches checkedBranch = branch.get(i);
            if (checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction) {
        Branches branches = findBranch(branchName);
        if (branches != null) {

            System.out.println("Customer details for branch " + branches.getBranchName());

            ArrayList<Customers> branchCustomers = branches.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customers branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getCustomerName() + "[ " + (i + 1) + " ]");
                if (showTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[ " + (j + 1) + " ] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
