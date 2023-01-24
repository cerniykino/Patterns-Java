package decorator;

public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void getName() {
        super.getName();
        System.out.println(" -- Concrete decorator 1");

    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
