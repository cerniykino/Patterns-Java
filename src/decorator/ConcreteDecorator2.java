package decorator;

public class ConcreteDecorator2 extends Decorator{
    public ConcreteDecorator2(Component decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void getName() {
        super.getName();
        System.out.println(" -- Concrete decorator 2");
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }
}
