public class ProduitFactory3 implements IProduitFactory {
    @Override
    public ProduitA getProduitA() {
        return new ProduitA3();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB3();
    }
}