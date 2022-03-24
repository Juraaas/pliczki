package pl.imiajd.jurewicz;

import java.time.LocalDate;

abstract public class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, int rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = LocalDate.of(rokProdukcji,1, 1);
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }
    abstract public void dzwiek();

    @Override
    public String toString(){
        return rokProdukcji + " " + producent;
    }
    public boolean equals(Instrument instrument){
        if (producent.equals(instrument.producent) && rokProdukcji.equals(instrument.rokProdukcji)){
            return true;
        }
        return false;
    }
}

