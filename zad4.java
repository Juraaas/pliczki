package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class zad4 {
    public static void szachownica(int n){
        BigInteger ziarenka = new BigInteger("0");
        BigInteger mnoznik = new BigInteger("2");
        for(int i = 0; i<n*n; i++)
            ziarenka = ziarenka.add(mnoznik.pow(i));

        System.out.println(ziarenka);
    }
    public static void main(String[] args){
        szachownica(5);

        szachownica(3);
    }
}
