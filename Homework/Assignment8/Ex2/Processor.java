package LeTranTrungHieu_2793.Assignment8.Ex2;

public class Processor {

    public static void main(String[] args) {
        FullTimeEmployee employee = new FullTimeEmployee("Hieu", 1500000);
        employee.displayInfo();
        System.out.println("Salary: " + employee.calculateSalary());
    }
}
