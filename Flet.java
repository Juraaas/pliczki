package pl.imiajd.jurewicz;

public class Flet extends Instrument{
    public Flet(String producent, int rokProdukcji) {
        super(producent, rokProdukcji);
    }
    public void dzwiek(){
        System.out.println("fiu fiu fiu");
    }
}
