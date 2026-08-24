package LeTranTrungHieu_2793.Lec05Loops;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tong = 0;
        int SoLuong = 0;
//        while (true) {
//            System.out.println("Nhap so di honey (nhan 0 de ket thuc): ");
//            double x = sc.nextDouble();
//            if (x == 0) {
//                break;
//            }
//            tong += x;
//            SoLuong++;
//        }
//        if (SoLuong == 0) {
//            System.out.println("Chua co du lieu dau honey");
//        } else {
//            double TrungBinh = tong / SoLuong;
//            System.out.println("Tong = " + tong);
//            System.out.println("So Luong = " + SoLuong);
//            System.out.println("Trung binh = " + TrungBinh);
//        }
//    }
        double x = 0;
        do {
            System.out.println("Nhap so di honey(Nhan 0 de ket thuc):");
            x = sc.nextDouble();
            tong += x;
            SoLuong++;
            if (SoLuong == 0) {
                System.out.println("Chua co du lieu dau honey");
            } else {
                double TrungBinh = tong / SoLuong;
                System.out.println("Tong = " + tong);
                System.out.println("So Luong = " + SoLuong);
                System.out.println("Trung binh = " + TrungBinh);
            }
        } while (x != 0);
    }
}
