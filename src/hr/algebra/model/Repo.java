package hr.algebra.model;

public class Repo {

    public static void SpremiPlacuZaposlenika(Zaposlenik z, double zarada ){
        double t = z.getTrenutnaZarada();
        z.setTrenutnaZarada(t+zarada);
        z.setPlaca();
    }
}
