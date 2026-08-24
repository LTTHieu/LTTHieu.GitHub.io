package LeTranTrungHieu_2793.Lec05Loops;

import java.util.Random;
import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int diem = 0;
        int soCauSai = 0;
        while (soCauSai < 3) {
            int soLuong = rand.nextInt(4) + 2;
            int tong = 0;
            System.out.println("Tinh: ");
            for (int i = 1; i <= soLuong; i++) {
                int soHang = rand.nextInt(10) + 1;
                tong += soHang;
                System.out.println("soHang");
                if (i < soLuong) {
                    System.out.println("+");
                }
            }
            //Nhap dap an
            System.out.println("=");
            int dapAn = sc.nextInt();
            //Kiem tra dung/sai
            if (dapAn == tong) {
                System.out.println("Dung r honey oi!!");
                diem++;
            } else {
                System.out.println("Sai r honey oi!!Dap an dung la: ");
                soCauSai++;
                System.out.println("So cau sai ne honey: " + soCauSai);
            }
            System.out.println("");
        }
        System.out.println("Honey thua goiiii!");
        System.out.println("Tong diem cua honey:" + diem);
    }
}
