package hr.algebra.model;

public class Kamion  extends Vozilo  implements Chargable{
    @Override
    public Double calculateCharge() {
        return 90.0;
    }
}
