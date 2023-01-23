package abstractfactory;

public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        ProductA2 productA2 = new ProductA2();
        return productA2;
    }

    @Override
    public AbstractProductB createProductB() {
        ProductB2 productB2 = new ProductB2();
        return productB2;
    }
}
