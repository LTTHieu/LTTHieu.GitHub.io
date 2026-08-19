package LeTranTrungHieu_2793.Lec03_Scanner;

import java.util.Scanner;

public class RectangularExercise {
    public static float calculateAreaRectangular(float dai,  float rong) {
        float area = dai * rong;
        return area;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap chieu dai:");
            float dai = scanner.nextFloat();
            
            System.out.println("Nhap chieu rong:");
            float rong = scanner.nextFloat();
            
            float area = calculateAreaRectangular(dai, rong);

            System.out.println("Tong S:" + area);    
    }
}
