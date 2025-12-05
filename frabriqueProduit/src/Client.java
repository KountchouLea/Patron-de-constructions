//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        System.out.println("Bonjour Dradone");
        FabriqueProduit fabrique = new FabriqueProduit();
        Produit produit = null;
        System.out.println("--- Création A ---");
        produit = fabrique.createProduit("A");
        produit.methodeproduit();
        System.out.println("--- Création B ---");
        produit = fabrique.createProduit("B");
        produit.methodeproduit();
        System.out.println("--- Création C ---");
        produit = fabrique.createProduit("C");
        produit.methodeproduit();
        System.out.println("--- Création D ---");
        produit = fabrique.createProduit("D");
        produit.methodeproduit();

        try {
            System.out.println("--- Création Inconnue ---");
            fabrique.createProduit("D");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur attrapée : " + e.getMessage());
        }

    }
}
