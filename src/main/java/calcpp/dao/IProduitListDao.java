package calcpp.dao;

import java.util.List;
import java.util.Optional;

public interface IProduitListDao {
    List<IProduitDAO> getTousLesProduits();
    Optional<IProduitDAO> getProduitById(Long id);
}
