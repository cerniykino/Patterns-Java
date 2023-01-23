package prototype;

public class Car extends Prototype{
    private int topSpeed;

    public Car(String name, String color, int engineHP, int topSpeed) {
        super(name, color, engineHP);
        this.topSpeed = topSpeed;
    }

    private Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }
    public void getData(){
        super.getData();
        System.out.println(" topSpeed: " + this.topSpeed);
    }
    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }
    @Override
    public Car clone(){
        return new Car(this);
    }
}
