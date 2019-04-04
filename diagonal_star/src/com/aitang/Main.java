package com.aitang;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printSquareStar(5);
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                String line = "";
                if (i == 0 || i == number - 1) {
                    for (int j = 0; j < number; j++) {
                        line += "*";
                    }
                } else {
                    int p1 = i;
                    int p2 = number - i - 1;

                    if (p1 < p2) {
                        line += "*";
                        for (int j = 1; j < p1; j++) {
                            line += " ";
                        }
                        line += "*";
                        for (int j = p1; j < p2 - 1; j++) {
                            line += " ";
                        }
                        line += "*";
                        for (int j = p2; j < number - 2; j++) {
                            line += " ";
                        }
                        line += "*";
                    } else if (p1 == p2) {
                        line += "*";
                        for (int j = 1; j < p1; j++) {
                            line += " ";
                        }
                        line += "*";
                        for (int j = p2; j < number - 2; j++) {
                            line += " ";
                        }
                        line += "*";
                    } else {
                        line += "*";
                        for (int j = 1; j < p2; j++) {
                            line += " ";
                        }
                        line += "*";
                        for (int j = p2; j < p1 - 1; j++) {
                            line += " ";
                        }
                        line += "*";
                        for (int j = p1; j < number - 2; j++) {
                            line += " ";
                        }
                        line += "*";
                    }
                }
                System.out.println(line);
            }
        }
    }
}
