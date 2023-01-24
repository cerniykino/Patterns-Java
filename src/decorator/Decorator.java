package decorator;

public abstract class Decorator implements Component {

    protected Component decoratedComponent;

    public Decorator(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public void getName() {
        decoratedComponent.getName();
    }

    @Override
    public int getPrice() {
        return decoratedComponent.getPrice();
    }
}
