package abstractfactory;

public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        ProductA1 productA1 = new ProductA1();
        return productA1;
    }

    @Override
    public AbstractProductB createProductB() {
        ProductB1 productB1 = new ProductB1();
        return productB1;
    }
}
