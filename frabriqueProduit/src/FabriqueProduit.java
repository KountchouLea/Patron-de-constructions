public class FabriqueProduit {
    // Définition des constantes
    public static final String TYPE_A = "A";
    public static final String TYPE_B = "B";
    public static final String TYPE_C = "C";

    // La méthode qui fabrique les objets
    public <Produit> Produit createProduit(String type) {
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
            case TYPE_D:
            produit = new ProduitD();
            break;
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
        return produit;
    }