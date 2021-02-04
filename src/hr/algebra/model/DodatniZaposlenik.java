package hr.algebra.model;

public class DodatniZaposlenik extends Zaposlenik implements ZaposlenikChargable {

    public DodatniZaposlenik(String ime, String prezime) {
        super(ime, prezime);
    }

    @Override
    public Double izracunPlace(double a) {
        return a*0.11;
    }
}
