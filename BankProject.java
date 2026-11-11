import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        double bal = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("\nEnter New Account Number: ");
        String newAccNum = sc.nextLine();

        BankAccount acc = new BankAccount(name, accNum, bal);

        System.out.println("\n------ Bank Account Details ------\n");
        System.out.println("Account Holder Name: " + acc.accountHolderName);
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Account Balance: " + acc.balance);
        System.out.println("\n------ Update Account Number ------\n");
        acc.setAccountNumber(newAccNum);
        System.out.println("Updated Account Number: " + acc.getAccountNumber());
        System.out.println("\n------ Updated Account Details ------\n");
        System.out.println("Account Holder Name: " + acc.accountHolderName);
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Account Balance: " + acc.balance);

        sc.close();
    }
}