package com.andrewsotirov;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Andrew", 5556);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.221);
        System.out.println("Balance for customer "+ customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }
        integerArrayList.add(1,2);
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }
    }
}
