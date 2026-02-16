package baitap02;

public class Car extends Vehical{


    public Car(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println( brand +  " Di chuyển bằng động cơ" );
    }
}
