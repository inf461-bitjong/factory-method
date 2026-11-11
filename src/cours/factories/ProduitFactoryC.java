package cours.factories;

import cours.abstractions.Produit;
import cours.abstractions.ProduitFactory;
import cours.models.ProduitC;

public class ProduitFactoryC extends ProduitFactory {
    @Override
    protected Produit createProduit() {
        return new ProduitC();
    }
}