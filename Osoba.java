package pl.imiajd.jurewicz;

import java.time.LocalDate;
import java.lang.Comparable;
import java.lang.Cloneable;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, int year, int month, int day){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.of(year, month, day);
    }
    @Override
    public String toString(){
        String wynik = "Osoba";
        wynik += "[" + nazwisko + "," + Integer.toString(dataUrodzenia.getYear()) + "-" + Integer.toString(dataUrodzenia.getMonthValue()) + "-" + Integer.toString(dataUrodzenia.getDayOfMonth()) + "]";
        return wynik;
    }
    public boolean equals(Osoba osoba) {
        if (this.nazwisko.equals(osoba.nazwisko) && this.dataUrodzenia.equals(osoba.dataUrodzenia)) {
            return true;
        }
        else {
            return false;
        }
    }
    public int compareTo(Osoba osoba) {
        int comp = this.nazwisko.compareTo(osoba.nazwisko);
        int comp2 = this.dataUrodzenia.compareTo(osoba.dataUrodzenia);

        if (comp > 0){
            return 1;
        }
        if (comp < 0) {
            return -1;
        }
        if(comp2 > 0) {
            return 1;
        }
        if(comp < 0) {
            return -1;
        }
        return 0;
    }
}
