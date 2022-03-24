package pl.imiajd.jurewicz;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int bok1, int bok2){
        super(x, y, bok1, bok2);
        this.setLocation(x, y);
        this.setSize(bok1, bok2);
    }
    public double getPeremiter(){
        double wynik = 0;
        wynik = 2*(this.width + this.height);
        return wynik;
    }
    public double getArea(){
        double wynik = 0;
        wynik = this.width * this.height;
        return wynik;
    }
}
