import java.util.Scanner;
public class TemperatureConveter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print(" choose 1 or 2:");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            // Convert Celsius to Fahrenheit
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " Celsius is equivalent to " + fahrenheit + " Fahrenheit.");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            // Convert Fahrenheit to Celsius
            double celsius = (fahrenheit - 32) * 5/9;

            System.out.println(fahrenheit + " Fahrenheit is equivalent to " + celsius + " Celsius.");
        } else {
            System.out.println("Invalid choice. Please select either 1 or 2.");
        }
        input.close();
    }
}