package factoryMethod;

public class ConcreteCreator implements Creator{
    private Product product;
    public ConcreteCreator(Product product) {
        this.product = product;
    }

    @Override
    public void getProduct() {
        System.out.println(this.product.getName());
    }
}
