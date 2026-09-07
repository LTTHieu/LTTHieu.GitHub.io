package LeTranTrungHieu_2793.Lec07String;

import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String original = sc.nextLine();

        String trimmed = original.trim();

        String upper = trimmed.toUpperCase();
        String lower = trimmed.toLowerCase();

        System.out.println("Original: [" + original + "]");
        System.out.println("Trimmed: [" + trimmed + "]");
        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
        System.out.println("Original length = " + original.length());
        System.out.println("Length after trim = " + trimmed.length());
    }
}
