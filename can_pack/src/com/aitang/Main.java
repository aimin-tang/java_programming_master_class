package com.aitang;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for (int i=0; i<=bigCount; i++) {
            for (int j=0; j<=smallCount; j++) {
                if (5 * i + j == goal) {
                    return true;
                }
            }
        }

        return false;
    }
}
