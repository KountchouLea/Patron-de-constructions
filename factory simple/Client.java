public class Client {
    public static void main(String[] args) {
        System.out.println("bonjour tous le monde");

        FabriqueProduit fabriqueProduit = new FabriqueProduit();
        Produit produit;

        produit = fabriqueProduit.createProduit(FabriqueProduit.TYPE_A);
        produit.MethodeProduit();

        produit = fabriqueProduit.createProduit(FabriqueProduit.TYPE_B);
        produit.MethodeProduit();

        produit = fabriqueProduit.createProduit(FabriqueProduit.TYPE_C);
        produit.MethodeProduit();

        String d = "D";
        try {
            produit = fabriqueProduit.createProduit(d);
            produit.MethodeProduit();
        } catch (IllegalArgumentException ex) {
            System.out.println("Erreur: " + ex.getMessage());
        }
    }
}
