package com.aitang;

public class Main {

    public static void main(String[] args) {
        double d1 = 20;
        double d2 = 80;

        double t = (d1 + d2) * 25;
        int r  = (int) t % 40;

        if (r <= 20) {
            System.out.println("Total was over the limit");
        }
    }
}
