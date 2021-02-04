package hr.algebra.model;

public class Kamion  extends Vozilo  implements Chargable{
    public Kamion(String naziv, int kolicinaPlina) {
        super(naziv, kolicinaPlina);
    }

    @Override
    public double calculateCharge() {
        return 90.0;
    }
}
