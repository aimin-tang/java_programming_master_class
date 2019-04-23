package com.aitang;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");
        bank.addCustomer("Tim", "Adelaide", 50.05);
        bank.addCustomer("Mike", "Adelaide", 175.34);
        bank.addCustomer("Percy", "Adelaide", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Bob", "Sydney", 44.22);

        System.out.println(bank.getBranchCustomers("Adelaide"));
    }
}
