package decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent("component 1 " , 3);
        component.getName();
        System.out.println("price: " + component.getPrice());

        component = new ConcreteDecorator1(component);

        component.getName();
        System.out.println("price: " + component.getPrice());

        component = new ConcreteDecorator2(component);

        component.getName();
        System.out.println("price: " + component.getPrice());

    }
}
