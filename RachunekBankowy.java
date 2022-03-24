package com.company;

public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;

    public double obliczMiesieczneOdsetki(){
        double odsetki = (saldo * rocznaStopaProcentowa) / 12;
        saldo += odsetki;
        return saldo;
    }
    public static void setRocznaStopaProcentowa(double newStopa){
        rocznaStopaProcentowa = newStopa;
    }
    public RachunekBankowy(double x){
        saldo = x;
    }
}
