package baitap03;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("vịt donal");

        Fish fish = new Fish("Nemo");

        duck.fly();
        duck.swim();

        fish.swim();
    }
}
