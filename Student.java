package pl.imiajd.jurewicz;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    private double sredniaOcen;

    public Student(String nazwisko, int year, int month, int day, double sredniaOcen) {
        super(nazwisko, year, month, day);
        this.sredniaOcen = sredniaOcen;
    }
    public int compareTo(Student test) {
        int comp = super.compareTo(test);
        int comp2;
        if (this.sredniaOcen > test.sredniaOcen) {
            comp2 = 1;
        } else if (this.sredniaOcen < test.sredniaOcen) {
            comp2 = -1;
        }
        return comp;
    }
}
