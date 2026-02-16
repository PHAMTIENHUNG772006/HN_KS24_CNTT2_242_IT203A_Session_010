package baitap01;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        Circle circle = new Circle(3);

        System.out.println("Diện tích tính chữ nhật : " + rectangle.getArea());
        System.out.println("Chu vi tính chữ nhật : " + rectangle.getPerimetter());


        System.out.println("Diện tích tính tròn : " + circle.getArea());
        System.out.println("Chu vi tính tròn : " + circle.getPerimetter());
    }
}
