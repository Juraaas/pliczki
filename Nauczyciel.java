package pl.imiajd.jurewicz;

public class Nauczyciel extends Osoba{
    private int pensja;

    public Nauczyciel(String nazwisko, String data_urodzenia, int pensja) {
        super(nazwisko, data_urodzenia);
        this.pensja = pensja;
    }
    @Override
    public String toString(){
        String sklejka = "";
        sklejka += super.toString() + " " + Integer.toString(pensja);
        return sklejka;
    }
    public int getPensja(){
        return this.pensja;
    }
}
