public class ProduitFactory1 implements IProduitFactory {
    @Override
    public ProduitA getProduitA() {
        return new ProduitA1(); // Crée A version 1
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1(); // Crée B version 1
    }
}