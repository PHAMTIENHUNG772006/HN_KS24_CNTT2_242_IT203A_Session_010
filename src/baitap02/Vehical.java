package baitap02;

public abstract class Vehical {
    protected String brand;
    public Vehical(String brand){
        this.brand = brand;
    }

    abstract void move();
}
