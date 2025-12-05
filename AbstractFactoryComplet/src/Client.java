public class Client {
    public static void main(String[] args) {
        System.out.println(".............Test Abstract Factory (3 Familles)............");

        // On utilise les interfaces pour manipuler les objets
        IProduitFactory usine;
        ProduitA produitA;
        ProduitB produitB;

        // --- Test Famille 1 ---
        System.out.println("\n--- Utilisation de l'usine 1 ---");
        usine = new ProduitFactory1();
        produitA = usine.getProduitA();
        produitB = usine.getProduitB();
        // Vérifiez les noms de méthodes (methodeproduit, methodeproduitA, etc.)
        produitA.methodeA();
        produitB.methodeB();

        // --- Test Famille 2 ---
        System.out.println("\n--- Utilisation de l'usine 2 ---");
        usine = new ProduitFactory2();
        produitA = usine.getProduitA();
        produitB = usine.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        usine = new ProduitFactory3(); // C'est ici qu'on appelle la nouvelle classe
        produitA = usine.getProduitA();
        produitB = usine.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}