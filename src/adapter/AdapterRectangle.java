package adapter;

public class AdapterRectangle implements Resizeable, Shape{
    Rectangle rectangle;

    public AdapterRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void resize(double ratio) {
        this.rectangle.resizeShape();
    }

    @Override
    public void draw() {
        this.rectangle.drawShape();
    }
}
