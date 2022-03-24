package pl.imiajd.jurewicz;

import java.time.LocalDate;

public class Pracownik extends Osoba {
    private LocalDate dataZatrudnienia;

    public Pracownik(String[] imiona, String nazwisko, int rokUrodzenia, int miesiacUrodzenia, int dzienUrodzenia, boolean plec, int rokZatrudnienia, int miesiacZatrudnienia, int dzienZatrudnienia){
        super(imiona, nazwisko, rokUrodzenia, miesiacUrodzenia, dzienUrodzenia, plec);
        this.dataZatrudnienia =  LocalDate.of(rokZatrudnienia, miesiacZatrudnienia, dzienZatrudnienia);
    }
    public LocalDate getDataZatrudnienia(){
        return dataZatrudnienia;
    }
}
