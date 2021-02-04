package hr.algebra.model;

public abstract class Vlak implements Boardable {

    private String naziv;

    public Vlak() {

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Vlak(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public abstract int getBoardingCapacity();
}
