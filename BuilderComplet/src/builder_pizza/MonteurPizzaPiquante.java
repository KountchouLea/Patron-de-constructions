package builder_pizza;

public class MonteurPizzaPiquante extends MonteurPizza {
    @Override
    public void monterPate() {
        pizza.setPate("feuilletée");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("piquante");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("pepperoni + salami");
    }
}