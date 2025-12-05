public class Client {
    public static void main(String[] args) {
        System.out.println("Mise à jour du système : Ajout du Produit D");

        // 1. Instanciation de la fabrique
        FabriqueProduit fabrique = new FabriqueProduit();
        Produit produit = null;

        // --- Tests existants ---
        produit = fabrique.createProduit(FabriqueProduit.TYPE_A);
        produit.methodeproduit();

        produit = fabrique.createProduit(FabriqueProduit.TYPE_B);
        produit.methodeproduit();

        produit = fabrique.createProduit(FabriqueProduit.TYPE_C);
        produit.methodeproduit();

        // --- 2. Test du NOUVEAU Produit D ---
        // Le client demande "D" sans savoir comment il est fabriqué
        produit = fabrique.createProduit(FabriqueProduit.TYPE_D);
        produit.methodeproduit();

        // Test d'erreur (pour un type lambda qui n'existe pas)
        try {
            fabrique.createProduit("lambda");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur prévue : " + e.getMessage());
        }
    }
}