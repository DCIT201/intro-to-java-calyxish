import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message and options for conversion
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Please select an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Read the user's choice and validate input
        int choice;
        while (true) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice! Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number (1 or 2).");
                scanner.next(); // Clear invalid input
            }
        }

        // Read the temperature value and validate input
        double temperature;
        while (true) {
            System.out.print("Enter the temperature to convert: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Perform the conversion based on the user's choice
        double convertedTemperature;
        if (choice == 1) {
            // Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", temperature, convertedTemperature);
        } else {
            // Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", temperature, convertedTemperature);
        }

        // Close the scanner
        scanner.close();
        System.out.println("Thank you for using the Temperature Converter!");
    }
}
