package hr.algebra.model;

public class Automobil extends Vozilo implements Chargable{


    public Automobil(String naziv, int kolicinaPlina) {
        super(naziv, kolicinaPlina);
    }

    @Override
    public double calculateCharge() {
        return 50.0;
    }
}
