public class ProduitFactory2 implements IProduitFactory {
    @Override
    public ProduitA getProduitA() {
        return new ProduitA2(); // Crée A version 2
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB2(); // Crée B version 2
    }
}