package calcpp.dao;

public class ProduitDaoImpl implements IProduitDAO{
    private Long id;
    private String nom;
    private double prixHT;

    public ProduitDaoImpl(Long id, String nom, double prixHT){
        this.id = id;
        this.nom = nom;
        this.prixHT = prixHT;
    }

    public ProduitDaoImpl() {

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public double getPrixHT() {
        return prixHT;
    }
}
