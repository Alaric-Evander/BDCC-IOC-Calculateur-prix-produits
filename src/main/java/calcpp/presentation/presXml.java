package calcpp.presentation;

import calcpp.controller.IProduitController;
import calcpp.controller.ProduitControllerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class presXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        IProduitController controller = context.getBean(IProduitController.class);

        controller.afficherTousLesProduits();

        ((ProduitControllerImpl) controller).afficherPrixTTC(1L);

        context.close();
    }
}
