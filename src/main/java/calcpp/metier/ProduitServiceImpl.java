package calcpp.metier;


import calcpp.dao.IProduitDAO;
import calcpp.dao.IProduitListDao;

import java.util.List;
import java.util.Optional;

public class ProduitServiceImpl implements IProduitService {
    private IProduitListDao produitListDao;
    public ProduitServiceImpl(IProduitListDao produitListDAO){
        this.produitListDao = produitListDAO;
    }

    public ProduitServiceImpl(IProduitDAO produitDAO) {
    }

    @Override
    public List<IProduitDAO> recupererTousLesProduits() {
        return produitListDao.getTousLesProduits();
    }

    @Override
    public Optional<Double> calculerPrixTTC(Long idProduit) {
        Optional<IProduitDAO> produit = produitListDao.getProduitById(idProduit);
        return produit.map(p -> p.getPrixHT() * 1.2);
    }
}
