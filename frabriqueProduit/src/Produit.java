public class FabriqueProduit {
    // Définition des constantes pour éviter les erreurs de frappe
    public static final String TYPE_A = "A";
    public static final String TYPE_B = "B";
    public static final String TYPE_C = "C";
    public static final String TYPE_D = "D";
    public static final String TYPE_E = "E"; // Ajout du nouveau type E

    public FabriqueProduit() {
    }

    public Produit createProduit(String type) {
        Produit produit = null;

        // Utilisation des constantes ici au lieu de "A", "B", etc.
        switch (type) {
            case TYPE_A -> produit = new ProduitA();
            case TYPE_B -> produit = new ProduitB();
            case TYPE_C -> produit = new ProduitC();
            case TYPE_D -> produit = new ProduitD();
            default -> throw new IllegalArgumentException("Type de produit inconnu : " + type);
        }

        return produit;
    }
}