package demo_lession10;

public class Bird implements  IMoveable{
// Phải triển khai tất cả các phương thức trừ tượng trong interface
    @Override
    public void move() {
        System.out.println("chim đang chạy");
    }

    @Override
    public void fly() {
        System.out.println("Chim đang bay");
    }

}
