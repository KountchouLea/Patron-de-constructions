public class FabriqueProduit {
    public static final String TYPE_A = "A";
    public static final String TYPE_B = "B";
    public static final String TYPE_C = "C";

    public Produit createProduit(String type) {
        switch (type) {
            case TYPE_A:
                return new ProduitA();
            case TYPE_B:
                return new ProduitB();
            case TYPE_C:
                return new ProduitC();
            default:
                throw new IllegalArgumentException("Type de produit inconnu: " + type);
        }
    }
}
