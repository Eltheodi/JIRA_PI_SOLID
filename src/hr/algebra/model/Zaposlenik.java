package hr.algebra.model;

public abstract class Zaposlenik implements ZaposlenikChargable {


    private String ime;
    private String prezime;
    private double trenutnaZarada;
private double placa;

    public double getPlaca() {
        return placa;
    }

    public void setPlaca() {
    this.placa = izracunPlace(trenutnaZarada);    }

    public double getTrenutnaZarada() {
        return trenutnaZarada;
    }

    public void setTrenutnaZarada(double trenutnaZarada) {
        this.trenutnaZarada = trenutnaZarada;
    }

    public Zaposlenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
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
        return  ime +
                " " + prezime ;
    }


    @Override
    public abstract Double izracunPlace(double a);
}
