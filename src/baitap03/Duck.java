package baitap03;

public class Duck extends Animal implements Swimmable,Flyable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Duck : Bay lên");
    }

    @Override
    public void swim() {
        System.out.println("Duck : Bơi bơi");
    }
}
