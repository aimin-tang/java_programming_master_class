package com.aitang;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String name) {
        for (int i=0; i<branches.size(); i++) {
            if (name.equals(branches.get(i).getName())) {
                System.out.println("Duplicated name for " + name);
                return false;
            }
        }
        branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomer(String customerName, String branchName, double firstTransaction) {
        for (int i=0; i<branches.size(); i++) {
            Branch branch = branches.get(i);
            if (branchName.equals(branch.getName())) {
                for (int j=0; j<branch.getCustomers().size(); j++) {
                    Customer customer = branch.getCustomers().get(j);
                    if (customerName.equals(customer.getName())) {
                        System.out.println("customer found");
                        return false;
                    }
                }
                branch.addCustomer(customerName, firstTransaction);
                return true;
            }
        }
        System.out.println("branch name " + branchName + " not found");
        return false;
    }

    public ArrayList<Customer> getBranchCustomers(String branchName) {
        for (int i=0; i<branches.size(); i++) {
            if (branchName.equals(branches.get(i).getName())) {
                return branches.get(i).getCustomers();
            }
        }
        return null;
    }
}
