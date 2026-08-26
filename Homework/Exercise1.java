package LeTranTrungHieu_2793.Homework;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n di honey: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so tai vi tri " + i + " : ");
            a[i] = sc.nextInt();
        }

        System.out.print("Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
