package pl.imiajd.jurewicz;

public class Fortepian extends Instrument{
    public Fortepian(String producent, int rokProdukcji){
        super(producent, rokProdukcji);
    }
    public void dzwiek() {
        System.out.println("do re mi fa sol la si do");
    }
}
