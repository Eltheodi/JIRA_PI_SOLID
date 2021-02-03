package hr.algebra.model;

public class DodatniZaposlenik extends OsnovniZaposlenik implements ZaposlenikChargable {

    @Override
    public Double izracunPlace(double a) {
        return a*0.11;
    }
}
