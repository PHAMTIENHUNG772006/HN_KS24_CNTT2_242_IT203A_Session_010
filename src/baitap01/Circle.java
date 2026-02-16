package baitap01;

public class Circle implements  Shape{
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimetter() {
        return Math.PI * 2 * radius;
    }
}
