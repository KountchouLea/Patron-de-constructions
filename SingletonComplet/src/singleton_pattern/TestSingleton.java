package singleton_pattern;

public class TestSingleton {
    public static void main(String[] args) {
        System.out.println("Test Singleton avec REGISTRE  ");

        // 1. Initialisation : On enregistre nos "Entités" uniques
        // Le Singleton "Base" est géré automatiquement, mais on ajoute l'enfant manuellement
        Singleton.register("Enfant", new SingletonEnfant());

        // 2. Récupération de l'instance BASE
        System.out.println("\n Appel instance Base ");
        Singleton sBase = Singleton.getInstance("Base");
        sBase.setValeurs(10, 20);
        sBase.affiche();

        // 3. Récupération de l'instance ENFANT (Nouvelle Entité)
        System.out.println("\n Appel instance Enfant ");
        Singleton sEnfant = Singleton.getInstance("Enfant");
        sEnfant.setValeurs(999, 888); // L'enfant a ses propres valeurs !
        sEnfant.affiche();

        // 4. Preuve d'unicité (Pattern Singleton respecté ?)
        System.out.println("\n Preuve d'unicité ");
        Singleton sEnfantBis = Singleton.getInstance("Enfant");

        if (sEnfant == sEnfantBis) {
            System.out.println("Succès : C'est bien toujours le MÊME objet Enfant.");
        } else {
            System.out.println("Échec : Instance dupliquée.");
        }

        // 5. Preuve d'indépendance
        System.out.println("\n Preuve d'indépendance ");
        System.out.print("Valeurs Base : ");
        sBase.affiche(); // Devrait être 10, 20
        System.out.print("Valeurs Enfant : ");
        sEnfant.affiche(); // Devrait être 999, 888

        // Test de la nouvelle fonctionnalité (nécessite un cast)
        ((SingletonEnfant) sEnfant).nouvelleFonctionnalite();
    }
}