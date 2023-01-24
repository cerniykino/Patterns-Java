package adapter;

public class Circle implements Shape, Resizeable{
    @Override
    public void resize(double ratio) {
        System.out.println("Resize circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}
