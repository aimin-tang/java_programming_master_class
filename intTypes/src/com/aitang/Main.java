package com.aitang;

public class Main {

    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 50000 + (long) (b + s + i) * 10;

        System.out.println("result is " + l);
    }
}
