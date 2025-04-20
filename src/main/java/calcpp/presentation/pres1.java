package calcpp.presentation;

import calcpp.controller.ProduitControllerImpl;
import calcpp.dao.*;
import calcpp.metier.IProduitService;
import calcpp.metier.ProduitServiceImpl;

public class pres1 {
    public static void main(String[] args) {
        IProduitListDao produitList = new ProduitListDAOImpl();
        IProduitService produitService = new ProduitServiceImpl(produitList);
        IProduitControllerDAO produitController = new ProduitControllerImpl(produitService);

        produitController.afficherTousLesProduits();
        produitController.afficherPrixTTC(2L);
    }
}
