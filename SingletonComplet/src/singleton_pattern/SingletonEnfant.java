package singleton_pattern;

public class SingletonEnfant extends Singleton {

    // Constructeur protected
    protected SingletonEnfant() {
        super(); // Appelle le constructeur du père
        System.out.println("  (C'est un Singleton Enfant !)");
    }

    // On surcharge la méthode d'affichage pour prouver que c'est bien l'enfant
    @Override
    public void affiche() {
        System.out.println(" Je suis le SINGLETON ENFANT (Extension) ! Valeurs : " + x + ", " + y);
    }

    // Une méthode spécifique à l'enfant
    public void nouvelleFonctionnalite() {
        System.out.println(" Je fais quelque chose que le père ne sait pas faire.");
    }
}