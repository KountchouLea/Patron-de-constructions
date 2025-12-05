package builder_pizza;

public class Client {
    public static void main(String[] args) {
        System.out.println("=== PIZZERIA BUILDER  ===");

        // 1. On embauche le Directeur
        Directeur directeur = new Directeur();

        // 2. Commande Pizza Reine (Existant)
        System.out.println("\n 1. Commande Pizza Reine ");
        Pizza p1 = directeur.construirePizzaReine();
        p1.print();

        // 3. Commande Pizza Piquante (Existant)
        System.out.println("\n 2. Commande Pizza Piquante ");
        Pizza p2 = directeur.construirePizzaPiquante();
        p2.print();

        // 4. Commande Pizza basic (NOUVEAU)
        System.out.println("\n 3. Commande Pizza basic  ");
        Pizza p3 = directeur.construirePizzabasic(); // Appel de la nouvelle méthode
        p3.print();
    }
}