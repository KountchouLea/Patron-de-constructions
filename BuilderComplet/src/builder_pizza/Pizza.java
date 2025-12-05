package builder_pizza;

public class Pizza {
    private String pate = "";
    private String sauce = "";
    private String garniture = "";

    // Setters pour définir les ingrédients
    public void setPate(String pate) {
        this.pate = pate;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setGarniture(String garniture) {
        this.garniture = garniture;
    }

    // Méthode pour afficher le résultat final
    public void print() {
        System.out.println("         ");
        System.out.println("        PIZZA SERVIE ");
        System.out.println("Pate : " + this.pate);
        System.out.println("Sauce : " + this.sauce);
        System.out.println("Garniture : " + this.garniture);
    }
}