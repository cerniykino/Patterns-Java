package decorator;

public class ConcreteComponent implements Component{
    private String name;
    private int price;

    public ConcreteComponent(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void getName() {
        System.out.print(this.name);
    }
}
