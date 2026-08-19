package LeTranTrungHieu_2793.Lec03_Scanner;

import java.util.Scanner;

public class FtoC {

    public static double ChangeFa(double Ce) {
        double Fa = Ce * 9 / 5 + 32;
        return Fa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nhiet do C:");
        double Ce = scanner.nextDouble();
        double Fa = ChangeFa(Ce);
        System.out.println("Fa:" + Fa);
    }
}
