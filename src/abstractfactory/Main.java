package abstractfactory;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        concreteFactory1.createProductA();
        concreteFactory1.createProductB();

        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        concreteFactory2.createProductA();
        concreteFactory2.createProductB();
    }
}
