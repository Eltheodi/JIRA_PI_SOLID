package hr.algebra.model;

public class RepositoryFactory {

    private RepositoryFactory() {


    }


    public static Repository getRepository () {

        return new Repo();
    }
}
