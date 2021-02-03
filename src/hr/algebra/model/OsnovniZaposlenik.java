package hr.algebra.model;

public class OsnovniZaposlenik implements ZaposlenikChargable {


    private String ime;
    private String prezime;

    public OsnovniZaposlenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public OsnovniZaposlenik() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }


    @Override
    public String toString() {
        return "Zaposlenik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }


    @Override
    public Double izracunPlace(double a) {
        return  a*0.1;
    }
}
