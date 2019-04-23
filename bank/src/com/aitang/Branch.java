package com.aitang;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double firstTransaction) {
        for (int i=0; i<customers.size(); i++) {
            if (name.equals(customers.get(i).getName())) {
                System.out.println("Duplicated name " + name);
                return false;
            }
        }
        this.customers.add(new Customer(name, firstTransaction));
        return true;
    }

    public boolean addTransaction(String name, double transaction) {
        for (int i=0; i<customers.size(); i++) {
            if (name.equals(customers.get(i).getName())) {
                customers.get(i).addTransaction(transaction);
                return true;
            }
        }
        System.out.println("Can't find name " + name + "!");
        return false;
    }
}
