package builder_pizza;

public class Directeur {

    // --- Recette existante 1 ---
    public Pizza construirePizzaPiquante() {
        MonteurPizza monteur = new MonteurPizzaPiquante();
        return monteur.getPizza();
    }

    // --- Recette existante 2 ---
    public Pizza construirePizzaReine() {
        MonteurPizza monteur = new MonteurPizzaReine();
        return monteur.getPizza();
    }

    // --- NOUVELLE RECETTE (Locale) ---
    public Pizza construirePizzabasic() {
        // 1. On instancie le nouveau monteur
        MonteurPizza monteur = new MonteurPizzabasic();
        // 2. On lance la construction (le getPizza appelle monterPate, Sauce, etc.)
        return monteur.getPizza();
    }
}