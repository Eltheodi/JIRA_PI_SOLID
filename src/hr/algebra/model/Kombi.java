package hr.algebra.model;

public class Kombi   extends Vozilo  implements Chargable{


    @Override
    public Double calculateCharge() {
        return 80.0;
    }
}
