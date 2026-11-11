import java.util.Scanner;

class BankAccount {
    void deposit(int amount) {
        System.out.println("Integer deposit: " + amount);
    }
    
    void deposit(double amount) {
        System.out.println("Double deposit: " + amount);
    }
}

class Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();
        
        System.out.print("Enter integer amount 1: ");
        int a = sc.nextInt();
        ba.deposit(a);
        
        System.out.print("Enter integer amount 2: ");
        int b = sc.nextInt();
        ba.deposit(b);
        
        System.out.print("Enter double amount: ");
        double c = sc.nextDouble();
        ba.deposit(c);
        
        sc.close();
    }
}
