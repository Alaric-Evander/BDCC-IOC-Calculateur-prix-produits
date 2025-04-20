package calcpp.metier;

import calcpp.dao.IProduitDAO;

import java.util.List;
import java.util.Optional;

public interface IProduitService {
    List<IProduitDAO> recupererTousLesProduits();
    Optional<Double> calculerPrixTTC(Long idProduit);
}
