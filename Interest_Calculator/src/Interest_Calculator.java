
import java.util.Scanner;

public class Interest_Calculator {
    private static double interestRate = 0;
    private static double principal = 0;
    private static int numOfYears = 0;
    private static double finalAmount = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the annual interest rate: ");
                interestRate = Double.parseDouble(scanner.nextLine().trim());
                break;
            } catch (java.lang.NumberFormatException p) {
                System.out.println("You have entered an invalid input. Please enter an number.");
            }
        }
        while (true) {
            try {
                System.out.println("Enter the principal amount: ");
                principal = Double.parseDouble(scanner.nextLine().trim());
                break;
            } catch (java.lang.NumberFormatException p) {
                System.out.println("You have entered an invalid input. Please enter an number.");
            }
        }
        while (true) {
            try {
                System.out.println("Enter the number of years the money is to stay in the fund: ");
                numOfYears = Integer.parseInt(scanner.nextLine().trim());
                break;
            } catch (java.lang.NumberFormatException p) {
                System.out.println("You have entered an invalid input. Please enter an number.");
            }
        }

        double quarterlyRate = interestRate/4/100;

        finalAmount = principal;
        for (int i = 1; i <=numOfYears ; i++) {
            double interestEarned = 0;
            for(int j=0; j<4;j++) {
                interestEarned += finalAmount *quarterlyRate;
                finalAmount += finalAmount * quarterlyRate;
            }
            System.out.printf("Year %d: Began with $%.2f Earned $%.2f Ended with $%.2f\n", i, principal, interestEarned, finalAmount);
            principal = finalAmount;
        }

    }
}