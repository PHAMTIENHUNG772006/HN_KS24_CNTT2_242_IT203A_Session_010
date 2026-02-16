package baitap01;

public class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimetter() {
        return  2 * (width + height);
    }
}
