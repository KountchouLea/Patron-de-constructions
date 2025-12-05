package builder_pizza;

public abstract class MonteurPizza {
    // L'objet en cours de construction
    protected Pizza pizza = new Pizza();

    // Méthode principale qui orchestre la construction (Template Method)
    public Pizza getPizza() {
        // Appel des méthodes pour construire les parties
        monterPate();
        monterSauce();
        monterGarniture();
        return pizza;
    }

    // Les étapes que chaque recette devra définir
    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
}