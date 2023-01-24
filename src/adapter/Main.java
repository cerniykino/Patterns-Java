package adapter;


public class Main{

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        AdapterRectangle adapterRectangle = new AdapterRectangle(rectangle);

        rectangle.drawShape();
        rectangle.resizeShape();


        circle.draw();
        adapterRectangle.draw();
        adapterRectangle.resize(3.0);
        circle.resize(4.0);
    }
}
