

import java.util.Scanner;

public class inrtousdconverter {

    // Constants for exchange rates
    private static final double INR_TO_USD_RATE = 0.014;  // 1 INR = 0.014 USD (example exchange rate)
    private static final double USD_TO_INR_RATE = 71.5;   // 1 USD = 71.5 INR (example exchange rate)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCurrency Converter Menu:");
            System.out.println("1. INR to USD");
            System.out.println("2. USD to INR");
            System.out.println("3. Quit");

            System.out.print("Enter your choice (1/2/3): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter amount in INR: ");
                    try {
                        double inrAmount = Double.parseDouble(scanner.nextLine());
                        double usdAmount = inrToUsd(inrAmount);
                        System.out.printf("%.2f INR = %.2f USD%n", inrAmount, usdAmount);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;
                case "2":
                    System.out.print("Enter amount in USD: ");
                    try {
                        double usdAmount = Double.parseDouble(scanner.nextLine());
                        double inrAmount = usdToInr(usdAmount);
                        System.out.printf("%.2f USD = %.2f INR%n", usdAmount, inrAmount);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;
                case "3":
                    System.out.println("Exiting the Currency Converter. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    // Methods to convert currency
    private static double inrToUsd(double amount) {
        return amount * INR_TO_USD_RATE;
    }

    private static double usdToInr(double amount) {
        return amount * USD_TO_INR_RATE;
    }
}