package LeTranTrungHieu_2793.Lec07String;

import java.util.Scanner;

public class Exer8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter character to count: ");
        char target = sc.nextLine().charAt(0);

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Occurrences of '" + target + "': " + count);
    }
}
