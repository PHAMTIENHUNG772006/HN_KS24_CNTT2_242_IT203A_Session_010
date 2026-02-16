package baitap05;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract double caculateSalary();
}
