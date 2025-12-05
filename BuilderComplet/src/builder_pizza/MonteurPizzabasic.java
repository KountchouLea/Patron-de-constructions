package builder_pizza;

public class MonteurPizzabasic extends MonteurPizza {
    @Override
    public void monterPate() {
        System.out.println("Préparation de la pâte basic...");
        pizza.setPate("Manioc");
    }

    @Override
    public void monterSauce() {
        System.out.println("Ajout de la sauce...");
        pizza.setSauce("Sauce Jaune");
    }

    @Override
    public void monterGarniture() {
        System.out.println("Ajout de la garniture...");
        pizza.setGarniture("Viande Hachée + Piment");
    }
}