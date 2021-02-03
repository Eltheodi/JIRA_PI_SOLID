package hr.algebra.model;

public class Autobus  extends Vozilo  implements Chargable{
    @Override
    public Double calculateCharge() {
        return 70.0;
    }
}
