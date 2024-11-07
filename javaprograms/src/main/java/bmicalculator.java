
import java.util.Scanner;

public class  bmicalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Prompt user to enter height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
       double bmi = calculateBMI(weight, height);

        // Display the BMI
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        // Interpret BMI
       interpretBMI(bmi);

        scanner.close();
    }

   // Method to calculate BMI
   public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
  }

    // Method to interpret BMI
    public static void interpretBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are normal weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
