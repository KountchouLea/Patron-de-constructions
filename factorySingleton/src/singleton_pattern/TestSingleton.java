package singleton_pattern;

public class TestSingleton {
    public static void main(String[] args) {
        System.out.println("--- Test du Patron Singleton ---");

        // ESSAI INTERDIT :
        // Singleton s = new Singleton(); // Ceci provoquerait une erreur rouge !
        // Le constructeur est privé[cite: 536].

        // 1. Premier appel : L'instance est créée
        System.out.println("Appel 1 :");
        Singleton s1 = Singleton.getInstance();
        s1.setValeurs(10, 20);
        s1.affiche();

        // 2. Second appel : On récupère l'instance existante
        System.out.println("\nAppel 2 :");
        Singleton s2 = Singleton.getInstance();
        // On ne change pas les valeurs ici, on affiche juste s2
        s2.affiche();

        // 3. Preuve absolue
        System.out.println("\n--- Preuve d'identité ---");
        if (s1 == s2) {
            System.out.println("Succès ! s1 et s2 sont exactement le MÊME objet en mémoire.");
        } else {
            System.out.println("Échec : Ce sont deux objets différents.");
        }

        // 4. Modification via s2, visible dans s1
        System.out.println("\nModification via s2...");
        s2.setValeurs(99, 88);
        System.out.print("Valeur dans s1 : ");
        s1.affiche(); // s1 a changé aussi car c'est le même objet !
    }
}