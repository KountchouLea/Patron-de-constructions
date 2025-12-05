public class FabriqueProduit {
    // Définition des constantes (Ajout de TYPE_D)
    public static final String TYPE_A = "A";
    public static final String TYPE_B = "B";
    public static final String TYPE_C = "C";
    public static final String TYPE_D = "D"; // <--- NOUVEAU

    // La méthode qui fabrique les objets
    public Produit createProduit(String type) {
        Produit produit = null;

        switch (type) {
            case TYPE_A:
                produit = new ProduitA();
                break;
            case TYPE_B:
                produit = new ProduitB();
                break;
            case TYPE_C:
                produit = new ProduitC();
                break;
            // Ajout du cas pour le Produit D
            case TYPE_D:
                produit = new ProduitD(); // <--- NOUVEAU
                break;
            default:
                throw new IllegalArgumentException("Type de produit inconnu : " + type);
        }
        return produit;
    }
}