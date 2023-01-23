package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(40);
        singleton.printData();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.printData();
        singleton1.setData(422);
    }
}
