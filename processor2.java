
package LeTranTrungHieu_2793.Assignment7.Exercise15;

import java.util.Scanner;

public class processor2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.addInfo();

        System.out.print("Enter deposit amount: ");
        Scanner sc = new Scanner(System.in);
        int depositAmount = sc.nextInt();
        account.deposit(depositAmount);

        System.out.print("Enter withdraw amount: ");
        int withdrawAmount = sc.nextInt();

        if (account.withdraw(withdrawAmount)) {
            System.out.println("Withdraw successful.");
        } else {
            System.out.println("Withdraw failed.");
        }

        account.display();
    }
}
