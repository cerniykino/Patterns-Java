package prototype;

public abstract class Prototype2 {
    private final String name;
    private final String color;
    private final int engineHP;

    public Prototype2(String name, String color, int engineHP) {
        this.name = name;
        this.color = color;
        this.engineHP = engineHP;
    }

    public void getData(){
        System.out.print("Name:" + this.name + " color: " + this.color + " powerEngine: " + this.engineHP);
    }

}
