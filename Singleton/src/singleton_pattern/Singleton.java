package singleton_pattern;

public final class Singleton {

    // 1. La variable statique qui va stocker l'UNIQUE instance
    // Elle est privée pour que personne ne puisse la modifier directement.
    private static Singleton instance = null;

    // Variables de l'exemple du cours (pour montrer que l'objet stocke des données)
    private int x;
    private int y;

    // 2. LE CONSTRUCTEUR PRIVÉ (Le point le plus important !)
    // En le mettant privé, on INTERDIT l'utilisation de "new Singleton()" à l'extérieur.
    private Singleton() {
        System.out.println("--> Initialisation de l'unique instance !");
        this.x = 0;
        this.y = 0;
    }

    // 3. Le point d'accès global (Méthode de classe)
    // C'est la seule porte d'entrée pour récupérer l'objet.
    public static Singleton getInstance() {
        // "Lazy Loading" : On ne crée l'objet que si on en a besoin
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // --- Méthodes "Métier" (Business Logic) tirées du support ---

    // Permet de modifier les valeurs de l'unique instance
    public void setValeurs(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Je suis l'unique instance. Mes valeurs : x=" + this.x + ", y=" + this.y);
    }

    public int somme(int a, int b) {
        return a + b;
    }

    // Bonus du slide 52 : Empêcher le clonage
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("On ne clone pas un Singleton !");
    }
}