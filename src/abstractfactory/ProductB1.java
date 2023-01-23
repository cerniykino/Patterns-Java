package abstractfactory;

public class ProductB1 implements AbstractProductB{
    @Override
    public String getName() {
        return "ProductB1";
    }

    public ProductB1() {
        System.out.println(this.getName());
    }
}
