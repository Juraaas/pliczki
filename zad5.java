package com.company;

import java.math.BigDecimal;

public class zad5 {
    public static void lokata(double k, double p, int n) {
        BigDecimal kapital = new BigDecimal(Double.toString(k)).setScale(2);
        BigDecimal procent = new BigDecimal(Double.toString(p / 100.0 + 1)).setScale(2);
        procent = procent.pow(n);
        kapital = kapital.multiply(procent);

        System.out.println(kapital);
    }


    public static void main(String[] args) {
        lokata(1000, 5, 5);
    }
}
