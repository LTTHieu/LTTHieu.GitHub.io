package LeTranTrungHieu_2793.Lec02_Variable;

public class OperatorExample2 {
    public static void main(String[] args) {
//        int x = 1;
//        int y = ++x + x++ - x + --x + 2 + x;
//        System.out.println(x);
//        System.out.println(y);
            
        int x = 1;
        int y = x-- + x++ - x - x++ + ++x + x + 1;
        System.out.println(x);
        System.out.println(y); 
    }
}
