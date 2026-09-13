
package LeTranTrungHieu_2793.Assignment7.Exercise11;

import java.util.Scanner;

class CarProfile {
    String make;
    String model;
    int year;

    void addProfile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter make: ");
        make = sc.nextLine();

        System.out.print("Enter model: ");
        model = sc.nextLine();

        System.out.print("Enter year: ");
        year = sc.nextInt();
    }

    void displayProfile() {
        System.out.println("Car Profile: " + make + " " + model + " (" + year + ")");
    }
}

    

