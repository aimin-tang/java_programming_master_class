package com.aitang;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        int i11 = (int) (d1 * 1000);
        int i21 = (int) (d2 * 1000);
        return (int) (d1 * 1000) == (int) (d2 * 1000);
    }
}
