package LeTranTrungHieu_2793.Lec03_Scanner;

import java.util.Scanner;

public class CircleANDPi {

    public static double calculateDiameter(double radius) {
        final double PI = 3.14159;
        double diameter = 2 * PI * radius;
        return diameter;
    }

    public static double calculatArea(double radius) {
        final double PI = 3.14159;
        double area = PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh:");
        double radius = scanner.nextDouble();

        double diameter = calculateDiameter(radius);
        double area = calculatArea(radius);

        System.out.println("Ban kinh:" + radius + "\nChu vi:" + diameter + "\nDien tich:" + area);
    }
}
