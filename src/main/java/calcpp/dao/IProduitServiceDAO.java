package calcpp.dao;

import java.util.List;
import java.util.Optional;

public interface IProduitServiceDAO {
    List<IProduitDAO> recupererTousLesProduits();
    Optional<Double> calculerPrixTTC(Long idProduit);
}
