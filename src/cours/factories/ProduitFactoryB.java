package cours.factories;

import cours.abstractions.Produit;
import cours.abstractions.ProduitFactory;
import cours.models.ProduitB;

public class ProduitFactoryB extends ProduitFactory {
    @Override
    protected Produit createProduit() {
        return new ProduitB();
    }
}