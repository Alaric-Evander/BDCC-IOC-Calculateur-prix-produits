package calcpp.dao;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class ProduitListDAOImpl implements IProduitListDao{

    private final List<IProduitDAO> produits = Arrays.asList(
            new ProduitDaoImpl(1L, "Ordinateur portable" , 2500),
            new ProduitDaoImpl(2L,"Clavier", 350),
            new ProduitDaoImpl(3L, "écran" , 2000 ),
            new ProduitDaoImpl(4L, "souris", 250)
    );

    @Override
    public List<IProduitDAO> getTousLesProduits() {
        return produits;
    }

    @Override
    public Optional<IProduitDAO> getProduitById(Long id) {
        return produits.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}
