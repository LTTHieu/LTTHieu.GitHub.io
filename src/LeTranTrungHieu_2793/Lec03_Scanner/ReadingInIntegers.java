package LeTranTrungHieu_2793.Lec03_Scanner;

import java.util.Scanner;

public class ReadingInIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        
        System.out.print("number=" + number);
    }
}
