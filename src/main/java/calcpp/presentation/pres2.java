package calcpp.presentation;

import calcpp.controller.IProduitController;
import calcpp.dao.IProduitDAO;
import calcpp.metier.IProduitService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pres2 {
    public static void main(String[] args) {
        try {
            // Charger le fichier de configuration
            BufferedReader reader = new BufferedReader(new FileReader("config.txt"));
            String controllerClass = reader.readLine().split("=")[1].trim();
            String serviceClass = reader.readLine().split("=")[1].trim();
            String daoClass = reader.readLine().split("=")[1].trim();
            reader.close();

            // Créer les instances via réflexion
            IProduitDAO produitDAO = (IProduitDAO) Class.forName(daoClass).getDeclaredConstructor().newInstance();
            IProduitService produitService = (IProduitService) Class.forName(serviceClass).getDeclaredConstructor(IProduitDAO.class).newInstance(produitDAO);
            IProduitController produitController = (IProduitController) Class.forName(controllerClass).getDeclaredConstructor(IProduitService.class).newInstance(produitService);

            // Utiliser le produitController
            produitController.afficherTousLesProduits();
            produitController.afficherPrixTTC(2L);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
