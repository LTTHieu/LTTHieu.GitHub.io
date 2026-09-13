
package LeTranTrungHieu_2793.Assignment7.Exercise15;



import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String owner;
    int balance;

    void addInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter owner: ");
        owner = sc.nextLine();

        System.out.print("Enter balance: ");
        balance = sc.nextInt();
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }

        return false;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
}


