package abstractfactory;

public class ProductA2 implements AbstractProductA{
    @Override
    public String getName() {
        return "ProductA2";
    }

    public ProductA2() {
        System.out.println(this.getName());
    }
}
