package pl.imiajd.jurewicz;

public class Skrzypce extends Instrument {
    public Skrzypce(String producent, int rokProdukcji) {
        super(producent, rokProdukcji);
    }
    public void dzwiek() {
        System.out.println("skrzyp skrzyp skrzyp");
    }
}
