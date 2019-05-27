package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        BankAccount account = new BankAccount(123324353,42323,"Sotiro","ravingbg@gmai.com"
//                ,"224 24242");
//
//        System.out.println(account.getAccountNumber());
//        System.out.println(account.getBalance());
//        System.out.println(account.getEmail());
//        System.out.println(account.getCustomerName());
//        System.out.println(account.getPhoneNumber());
//
//        account.depositFunds(200.32);
//        account.withdrawFunds(200);
//        account.depositFunds(1554);

        VipCustomer generic = new VipCustomer();
        VipCustomer andrew = new VipCustomer("Andrew","andrew@abv.bg");
        VipCustomer pesho = new VipCustomer("Pesho", 200,"pesho@pedal.com");
        System.out.println("Name is " + generic.getName() + " VIP credit limit is " + generic.getCreditLimit() +
                " and email address is " + generic.getEmail());
        System.out.println("Name is " + andrew.getName() + " VIP credit limit is " + andrew.getCreditLimit() +
                " and email address is " + andrew.getEmail());
        System.out.println("Name is " + pesho.getName() + " VIP credit limit is " + pesho.getCreditLimit() +
                " and email address is " + pesho.getEmail());

    }
}
