package LeTranTrungHieu_2793.Lec07String;

import java.util.Scanner;

public class Exer7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        StringBuilder sb = new StringBuilder(original);
        sb.reverse();

        String reversed = sb.toString();

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
