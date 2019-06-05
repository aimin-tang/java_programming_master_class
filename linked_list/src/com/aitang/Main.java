package com.aitang;

import java.util.ArrayList;

public class Main {
    public static boolean isFactorial(int n) {
        int c = 1;
        int product = 1;

        while (true) {
            if (product > n) {
                return false;
            } else if (product == n) {
                return true;
            } else {
                c++;
                product *= c;
            }
        }
    }

    public static void main(String[] args) {
        findAllFactorials();
        System.out.println(allFactorials.contains(1L));
        System.out.println(allFactorials.contains(2L));
        System.out.println(allFactorials.contains(3L));
        System.out.println(allFactorials.contains(120L));
    }

    static ArrayList<Long> allFactorials = new ArrayList<Long>();

    public static void findAllFactorials() {

        int c = 1;
        long product = c;
        allFactorials.add(product);
        while (true) {
            c++;
            product *= c;
            if (product > Integer.MAX_VALUE) {
                break;
            }
            allFactorials.add(product);
        }
    }

}
