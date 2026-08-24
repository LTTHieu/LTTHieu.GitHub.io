package LeTranTrungHieu_2793.Lec05Loops;

import java.util.*;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int SoBiMat = random.nextInt(20) + 1;
        int Doan;
        int SoLanDoan = 0;
        do {
            System.out.println("Nhap so honey doan di(1-20): ");
            Doan = scanner.nextInt();
            SoLanDoan++;
            if (Doan < SoBiMat) {
                System.out.println("Sai r honey !! Doan so lon hon di honey !!");
            } else if (Doan > SoBiMat) {
                System.out.println("Sai r honey !! Doan so nho hon di honey !!");
            } else {
                System.out.println("Chuc mung honey da doan trung !!");
                System.out.println("So lan honey da thu: " + SoLanDoan);
            }
        } while (Doan != SoBiMat);
    }
}
