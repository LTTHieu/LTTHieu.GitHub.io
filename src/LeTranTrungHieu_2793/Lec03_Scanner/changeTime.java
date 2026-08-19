package LeTranTrungHieu_2793.Lec03_Scanner;

import java.util.Scanner;

public class changeTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so giay:");
        int totalSecond = scanner.nextInt();
        
        int hours = totalSecond / 3600;
        int minutes =(totalSecond % 3600) / 60;
        int second = totalSecond & 60;   
        
        System.out.println(hours + " gio " + minutes + " phut " + second + " giay ");
    }
}
