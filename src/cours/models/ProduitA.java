package cours.models;

import cours.abstractions.Produit;

public class ProduitA extends Produit {
    @Override
    public void methodeproduit() {
        System.out.println("je suis un produit de type A");
        System.out.println("produitA.methodeproduit()");
    }
}