import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int money;
        int month;
        double interestRate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your money: ");
        money = scanner.nextInt();
        System.out.println("Enter months: ");
        month = scanner.nextInt();
        System.out.println("Enter interest rate: ");
        interestRate = scanner.nextDouble();
        double interest = money*interestRate/12 *month;
        System.out.println("Your total interest is: " +(int)interest);
    }
}
