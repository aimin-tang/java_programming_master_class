package com.aitang;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter count:\r");
        int count = scanner.nextInt();

        int[] array = readIntegers(count);
        int min = findMin(array);
        System.out.println("Min is " + min);

    }

    public static int[] readIntegers(int count) {

        int[] array = new int[count];

        for (int i=0; i<count; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i=1; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
