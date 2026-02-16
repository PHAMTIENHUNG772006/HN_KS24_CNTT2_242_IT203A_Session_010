package baitap02;

public class Bicycle extends Vehical{


    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println( brand +  " Di chuyển bằng sức người");
    }
}
