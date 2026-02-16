package baitap05;

public class OfficeStaff extends  Employee{

    @Override
    double caculateSalary() {
        return getBaseSalary();
    }
}
