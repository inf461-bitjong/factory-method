package cours.models;

import cours.abstractions.Produit;

public class ProduitC extends Produit {
    @Override
    public void methodeproduit() {
        System.out.println("je suis un produit de type C");
        System.out.println("produitC.methodeproduit()");
    }
}