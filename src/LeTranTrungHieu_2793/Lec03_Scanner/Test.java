package LeTranTrungHieu_2793.Lec03_Scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fullname:");
        String fullname = scanner.nextLine();
        
        System.out.println("fullname: " + fullname);
    }
}