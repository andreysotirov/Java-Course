package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addBranch("Mladost");
        bank.addCustomer("Mladost", "andrew", 50000);
        bank.addCustomer("Mladost", "mitko", 10);
        bank.addCustomer("Mladost", "kuro", 100);

        bank.addBranch("Liulin");
        bank.addCustomer("Liulin", "putio", 1110);
        bank.addCustomer("Liulin", "kura", 21110);

        bank.addCustomerTransaction("Mladost", "andrew", 200);
        bank.addCustomerTransaction("Mladost", "andrew", 200);
        bank.addCustomerTransaction("Mladost", "andrew", 20);

        bank.listCustomers("Mladost", true);

    }
}
