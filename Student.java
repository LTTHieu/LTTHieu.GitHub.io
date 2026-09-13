
package LeTranTrungHieu_2793.Assignment7.Exercise18;


import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String id;
    String name;
    ArrayList<Double> grades = new ArrayList<>();

    void addInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.nextLine();

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = sc.nextDouble();
            addGrade(grade);
        }
    }

    void addGrade(double grade) {
        grades.add(grade);
    }

    double getAverage() {
        if (grades.size() == 0) {
            return 0;
        }

        double sum = 0;

        for (int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }

        return sum / grades.size();
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + getAverage());
    }
}


    



