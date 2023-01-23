package prototype;

public class Car2 extends Prototype2 implements Cloneable{
    private int topSpeed;

    public Car2(String name, String color, int engineHP, int topSpeed) {
        super(name, color, engineHP);
        this.topSpeed = topSpeed;
    }
    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }

    @Override
    public void getData() {
        super.getData();
        System.out.println(" topSpeed: " + this.topSpeed);
    }

    @Override
    protected Car2 clone() throws CloneNotSupportedException {
        return (Car2)super.clone();
    }
}
