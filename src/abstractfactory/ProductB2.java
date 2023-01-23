package abstractfactory;

public class ProductB2 implements AbstractProductB{
    @Override
    public String getName() {
        return "ProductB2";
    }

    public ProductB2() {
        System.out.println(this.getName());
    }
}
