package hr.algebra.model;

public abstract class Vozilo implements  Chargable{

 private String naziv;
 private int kolicinaPlina;

 public Vozilo(String naziv, int kolicinaPlina) {
  this.naziv = naziv;
  this.kolicinaPlina = kolicinaPlina;
 }

 public String getNaziv() {
  return naziv;
 }

 public void setNaziv(String naziv) {
  this.naziv = naziv;
 }

 public int getKolicinaPlina() {
  return kolicinaPlina;
 }

 public void setKolicinaPlina(int kolicinaPlina) {
  this.kolicinaPlina = kolicinaPlina;
 }



 @Override
 public String toString() {
  return "Vozilo{" +
          "naziv='" + naziv + '\'' +
          ", kolicinaPlina=" + kolicinaPlina +
          '}';
 }

 @Override
 public abstract double calculateCharge() ;
}
