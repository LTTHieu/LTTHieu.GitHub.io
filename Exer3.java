package LeTranTrungHieu_2793.Lec07String;

public class Exer3 {

    public static void main(String[] args) {

        String first = "Duy Tan";
        String second = "University";

        String result1 = first + " " + second;
        System.out.println("Using +: " + result1);

        String result2 = first.concat(" ").concat(second);
        System.out.println("Using concat: " + result2);

        first.concat(" University");
        System.out.println("first after concat without reassignment: " + first);
    }
}
