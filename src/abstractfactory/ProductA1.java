package abstractfactory;

public class ProductA1 implements AbstractProductA{
    @Override
    public String getName() {
        return "ProductA1";
    }

    public ProductA1() {
        System.out.println(this.getName());
    }
}
