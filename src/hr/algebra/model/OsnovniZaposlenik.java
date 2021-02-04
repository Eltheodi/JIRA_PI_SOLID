package hr.algebra.model;

public class OsnovniZaposlenik extends Zaposlenik implements ZaposlenikChargable {
    public OsnovniZaposlenik(String ime, String prezime) {
        super(ime, prezime);
    }

    @Override
    public Double izracunPlace(double a) {
        return a*0.10;    }
}
