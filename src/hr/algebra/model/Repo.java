package hr.algebra.model;

public class Repo implements Repository {


    @Override
    public  void SpremiPlacuZaposlenika(Zaposlenik z, double zarada) {

            double t = z.getTrenutnaZarada();
            z.setTrenutnaZarada(t+zarada);
            z.setPlaca();

    }
}
