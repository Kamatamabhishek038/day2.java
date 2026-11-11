

import java.util.Scanner;

class Loan {

    double calculateInterest(double p) {
        return p * 5 / 100;
    }

    double calculateInterest(double p, int y) {
        return p * 7 * y / 100;
    }

    double calculateInterest(double p, int y, double r) {
        return p * r * y / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Loan l = new Loan();

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter years: ");
        int y = sc.nextInt();

        System.out.print("Enter rate: ");
        double r = sc.nextDouble();

        double interest = l.calculateInterest(p, y, r);

        System.out.println("Interest = " + interest);

        sc.close();
    }
}