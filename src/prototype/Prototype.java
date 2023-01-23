package prototype;

public abstract class Prototype {

    private final String name;
    private final String color;
    private final int engineHP;

    public Prototype(String name, String color, int engineHP) {
        this.name = name;
        this.color = color;
        this.engineHP = engineHP;
    }

    protected Prototype(Prototype prototype){
        this.name = prototype.name;
        this.color = prototype.color;
        this.engineHP = prototype.engineHP;
    }
    public void getData(){
        System.out.print("Name:" + this.name + " color: " + this.color + " powerEngine: " + this.engineHP);
    }
    public abstract Prototype clone();
}
