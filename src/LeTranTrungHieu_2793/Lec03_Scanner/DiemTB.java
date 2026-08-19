package LeTranTrungHieu_2793.Lec03_Scanner;

import java.util.Scanner;

public class DiemTB {

    public static double calculateAvg(double toan, double laptrinh, double tienganh) {
        double DiemTB = (toan + laptrinh + tienganh) / 3;
        return DiemTB;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem toan:");
        double toan = scanner.nextDouble();

        System.out.println("Nhap diem lap trinh:");
        double laptrinh = scanner.nextDouble();

        System.out.println("Nhap deim tieng anh:");
        double tienganh = scanner.nextDouble();

        Double DiemTB = calculateAvg(toan, laptrinh, tienganh);

        System.out.println("Diem toan:" + toan + "\nDiem lap trinh:" + laptrinh + "\nDiem tieng anh:" + tienganh
                + "\nTong diem 3 mon:" + DiemTB);
    }
}
