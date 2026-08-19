package LeTranTrungHieu_2793.Lec03_Scanner;

import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter Ho va Ten:");
        String fullname = scanner.nextLine();

        System.out.println("Enter GPA: ");
        float GPA = scanner.nextFloat();
        
        scanner.nextLine();
        
        System.out.println("Enter Chuyen Nganh:");
        String major = scanner.nextLine();

        System.out.println("Enter Que Quan:");
        String hometown = scanner.nextLine();

        System.out.println("Ten: " + fullname);
        System.out.println("GPA: " + GPA);
        System.out.println("Nganh: " + major);
        System.out.println("Que Quan: " + hometown);
    }
}
