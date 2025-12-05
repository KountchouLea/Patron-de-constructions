package singleton_pattern;

import java.util.HashMap;
import java.util.Map;

// 1. On retire "final" pour permettre l'héritage (Slide 55)
public class Singleton {

    // 2. Le REGISTRE : Une Map pour stocker plusieurs singletons nommés
    private static Map<String, Singleton> registre = new HashMap<>();

    // Variables d'instance
    protected int x;
    protected int y;

    // 3. Constructeur PROTECTED (et non private) pour que les enfants puissent l'appeler
    protected Singleton() {
        System.out.println("--> Création d'une instance Singleton");
        this.x = 0;
        this.y = 0;
    }

    // 4. Nouvelle méthode getInstance qui accepte un "nom" (Clé)
    public static Singleton getInstance(String nom) {
        // Si l'instance n'existe pas encore dans le registre, on la crée
        if (!registre.containsKey(nom)) {
            // Par défaut, on crée un Singleton de base.
            // (Dans un système réel, on utiliserait le nom de la classe pour charger dynamiquement)
            registre.put(nom, new Singleton());
        }
        return registre.get(nom);
    }

    // Méthode pour enregistrer manuellement un enfant (Astuce pour l'exercice)
    public static void register(String nom, Singleton instance) {
        if (!registre.containsKey(nom)) {
            registre.put(nom, instance);
        }
    }

    public void setValeurs(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Je suis l'instance de base. Valeurs : " + x + ", " + y);
    }
}