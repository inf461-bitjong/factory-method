package cours.factories;

import cours.abstractions.Produit;
import cours.abstractions.ProduitFactory;
import cours.models.ProduitA;

public class ProduitFactoryA extends ProduitFactory {
    @Override
    protected Produit createProduit() {
        return new ProduitA();
    }
}