package LeTranTrungHieu_2793.Assignment8.Ex2;

public abstract class Employee {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }

    public abstract double calculateSalary();
}
