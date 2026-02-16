package baitap05;

public class Main {
    public static void main(String[] args) {
        OfficeStaff officeStaff = new OfficeStaff();

        officeStaff.setName("Hưng");
        officeStaff.setBaseSalary(50000);

        System.out.println("Lương nhân viên thường : " + officeStaff.getBaseSalary());

        Manager manager = new Manager();
        manager.setName("Quang");
        manager.setBaseSalary(50000);
        manager.getBonus();

        System.out.println("Lương nhân viên quản lý : " + manager.getBaseSalary());
        System.out.println("Lương nhân viên quản lý đã thêm bonus : " + manager.caculateSalary());
    }
}
