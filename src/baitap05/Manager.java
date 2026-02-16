package baitap05;

public class Manager extends Employee implements BonusCalculator {

    @Override
    public double getBonus() {
        return 500;
    }

    @Override
    double caculateSalary() {
        return getBaseSalary() + getBonus();
    }
}
