package com.aitang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        input_calculator();
    }

    public static void input_calculator() {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int c = 0;

        while (true) {
            // read input
            if (s.hasNextInt()) {
                int n = s.nextInt();
                sum += n;
                c++;
                s.nextLine();
            } else {
                if (c == 0) {
                    System.out.println("SUM = 0 AVG = 0");
                } else {
                    long avg = (long) Math.round(sum * 1.0 / c);
                    System.out.println("SUM = " + sum + " AVG = " + avg);
                }
                break;
            }
        }
    }
}
