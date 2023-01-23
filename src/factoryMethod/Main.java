package factoryMethod;

public class Main {
    public static void main(String[] args) {
        ConcreteProduct2 concreteProduct2 = new ConcreteProduct2();
        ConcreteProduct concreteProduct = new ConcreteProduct();

        ConcreteCreator concreteCreator = new ConcreteCreator(concreteProduct2);
        concreteCreator.getProduct();

        concreteCreator = new ConcreteCreator(concreteProduct);
        concreteCreator.getProduct();
    }
}
