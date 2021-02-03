package hr.algebra.model;

public class Automobil extends Vozilo implements Chargable{


    @Override
    public Double calculateCharge() {
        return 50.0;
    }
}
