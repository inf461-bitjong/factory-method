package cours;

import cours.abstractions.Produit;
import cours.abstractions.ProduitFactory;
import cours.factories.ProduitFactoryA;
import cours.factories.ProduitFactoryB;
import cours.factories.ProduitFactoryC;

public class ClientCours {
    public static void main(String[] args) {
        System.out.println("--- EXEMPLE DU COURS : Factory Method ---");

        ProduitFactory factoryA = new ProduitFactoryA();
        ProduitFactory factoryB = new ProduitFactoryB();
        ProduitFactory factoryC = new ProduitFactoryC();

        Produit produit = factoryA.getProduit();
        produit.methodeproduit();

        produit = factoryB.getProduit();
        produit.methodeproduit();

        produit = factoryC.getProduit();
        produit.methodeproduit();
    }
}