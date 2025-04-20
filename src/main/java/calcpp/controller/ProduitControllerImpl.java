package calcpp.controller;

import calcpp.dao.IProduitDAO;
import calcpp.metier.IProduitService;

import java.util.List;
import java.util.Optional;

public class ProduitControllerImpl implements IProduitController {
    private final IProduitService produitService;

    public ProduitControllerImpl(IProduitService produitService) {
        this.produitService = produitService;
    }

    @Override
    public void afficherTousLesProduits() {
        List<IProduitDAO> produits = produitService.recupererTousLesProduits();
        produits.forEach(p -> System.out.println("ID: "+p.getId()+"; Nom: "+p.getNom()+", Prix Hors Tax: "+p.getPrixHT()+" MAD"));
    }

    @Override
    public void afficherPrixTTC(Long idProduit) {
        Optional<Double> prixTTC = produitService.calculerPrixTTC(idProduit);
        if(prixTTC.isPresent()) {
            System.out.println("Prix TTC du produit "+idProduit+ " : "+prixTTC+" MAD");
        } else {
            System.out.println("Produit n'existe pas");
        }
    }
}
