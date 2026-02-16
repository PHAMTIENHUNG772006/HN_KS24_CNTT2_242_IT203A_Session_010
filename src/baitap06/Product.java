package baitap06;

import java.util.Comparator;
import java.util.Arrays;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + '}' + "\n";
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Product("Quần dài",120000);
        products[1] = new Product("Áo khoác",130000);
        products[2] = new Product("váy",12000);



        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        System.out.println("Sắp xếp theo giá: " + "\n" + Arrays.toString(products) );
        Arrays.sort(products, (p1, p2) -> p1.getName().compareTo(p2.getName()));


        System.out.println("Sắp xếp theo tên: " + Arrays.toString(products));
    }
}
