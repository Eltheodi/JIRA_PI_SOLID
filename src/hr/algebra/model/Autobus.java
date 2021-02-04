package hr.algebra.model;

public class Autobus  extends Vozilo  implements Chargable{
    public Autobus(String naziv, int kolicinaPlina) {
        super(naziv, kolicinaPlina);
    }

    @Override
    public double calculateCharge() {
        return 70.0;
    }
}
