public class Client {
    public static void main(String[] args) {
        System.out.println(".............Test Abstract Factory............");

        // 1. On choisit d'utiliser l'usine de la famille 1
        System.out.println("--- Utilisation de l'usine 1 ---");
        IProduitFactory usine1 = new ProduitFactory1();

        ProduitA produitA = usine1.getProduitA();
        ProduitB produitB = usine1.getProduitB();

        produitA.methodeA(); // Affiche A1
        produitB.methodeB(); // Affiche B1

        // 2. On change d'usine pour la famille 2
        System.out.println("\n--- Utilisation de l'usine 2 ---");
        IProduitFactory usine2 = new ProduitFactory2();

        produitA = usine2.getProduitA(); // La variable est réutilisée
        produitB = usine2.getProduitB();

        produitA.methodeA(); // Affiche A2
        produitB.methodeB(); // Affiche B2
    }
}