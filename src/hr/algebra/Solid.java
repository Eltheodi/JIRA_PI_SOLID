package hr.algebra;

import hr.algebra.model.*;

import java.util.ArrayList;
import java.util.List;

public class Solid {

    private static double ukupnaZarada;
    public static void main(String[] args) {
        // write your code here
        ukupnaZarada=0;
        System.out.println("~~~~~~~~~~~~~~~~~Terminal XYZ~~~~~~~~~~~~~~~~~~~");
        Zaposlenik z = new OsnovniZaposlenik("ivo", "ivic");

        System.out.println("Transakcije obavlja zaposlenik: " + z.toString());
        System.out.println("Trenutno zarada za zaposlenika" + z.getTrenutnaZarada());
        System.out.println();
        System.out.println("Dolazi niz vozila");
        List<Vozilo> voziloList= getVozila();
        System.out.println("IspisVozila");
        ispisVozila(voziloList);
        System.out.println("Obrada vozila ");
        obradaVozila(voziloList, z);

        Zaposlenik z2 = new DodatniZaposlenik("Ana", "Anić");
        System.out.println("Novi zaposlenik, dodatni obavlja transakciju: ");
        System.out.println("Dolazi drugi niz vozila");
        List<Vozilo> vozila = getVozila();
        System.out.println("\n");

        System.out.println("IspisVozila");
        ispisVozila(vozila);
        System.out.println("\n");

        System.out.println("Obrada vozila ");
        obradaVozila(vozila, z2);


    }

    private static void obradaVozila(List<Vozilo> voziloList, Zaposlenik z) {
        List<Vozilo> malaVozila = new ArrayList<>();
        List<Vozilo> velikaVozila = new ArrayList<>();
        double totalPayment = 0;
        for (Vozilo vozilo : voziloList) {
            double karta = vozilo.calculateCharge();
            if (karta == 50 || karta == 80){
                malaVozila.add(vozilo);
            }
            else {
                velikaVozila.add(vozilo);
            }
            Repo.SpremiPlacuZaposlenika(z, karta);
            totalPayment += karta;
        }

        ukupnaZarada+=totalPayment;
        System.out.println("Broj obrađenih vozila: " + voziloList.size());
        System.out.println("Broj malih vozila: " + malaVozila.size());
        System.out.println("Broj velikih vozila: " + velikaVozila.size());
        System.out.println("Trenutna zarada za ovu obradu: " + totalPayment);
        System.out.println("Ukupna zarada: " + ukupnaZarada);
        System.out.println("Zaposlenik: " +z );
        System.out.println("Ukupna placa zaposlenika trenutna " + z.getPlaca());



    }

    private static void ispisVozila(List<Vozilo> voziloList) {
        voziloList.forEach(System.out::println);
        System.out.println("Vozila za napuniti:");
        voziloList.forEach(v -> {
            if (v.getKolicinaPlina()<=10)
            {
                System.out.println(v);
            }
        });
    }

    private static List<Vozilo> getVozila() {
        List<Vozilo> lista = new ArrayList<>();
        lista.add(new Automobil("v1", 7));
        lista.add(new Automobil("v1", 20));
        lista.add(new Automobil("v2", 30));
        lista.add(new Automobil("v3", 10));
        lista.add(new Automobil("v4", 40));
        lista.add(new Kombi("k1", 20));
        lista.add(new Kombi("k2", 50));
        lista.add(new Kombi("k3", 60));
        lista.add(new Kombi("k4", 40));
        lista.add(new Kamion("kam1", 33));
        lista.add(new Kamion("kam2", 66));
        lista.add(new Kamion("kam3", 77));
        lista.add(new Autobus("bus", 67));
        return lista;
    }
}
