package prototype;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException{
        Car car = new Car("Porshe", "black", 1000, 372);
        Car car1 = car.clone();

        car1.setTopSpeed(400);
        car.getData();
        car1.getData();

        Car2 car2 = new Car2("Bugatti", "orange", 1200, 420);
        Car2 car3 = car2.clone();

        car3.setTopSpeed(500);
        car2.getData();
        car3.getData();

    }
}
