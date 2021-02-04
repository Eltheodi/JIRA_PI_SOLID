package hr.algebra.model;

public class Kombi   extends Vozilo  implements Chargable{


    public Kombi(String naziv, int kolicinaPlina) {
        super(naziv, kolicinaPlina);
    }

    @Override
    public double calculateCharge() {
        return 80.0;
    }
}
