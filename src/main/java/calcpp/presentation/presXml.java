package calcpp.presentation;

import calcpp.controller.IProduitController;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class presXml {
    public static void main(String[] args) {
        try {
            // Charger le contexte Spring à partir du fichier XML
            Resource resource = new ClassPathResource("spring-beans.xml");
            XmlBeanFactory factory = new XmlBeanFactory(resource);

            // Récupérer le bean de ProduitController
            IProduitController produitController = (IProduitController) factory.getBean("produitController");

            // Utiliser le produitController
            produitController.afficherTousLesProduits();
            produitController.afficherPrixTTC(2L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
