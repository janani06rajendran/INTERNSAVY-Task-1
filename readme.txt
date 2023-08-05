
                                                                      INTERNSAVY    TASK 
Creating a temperature converter in Java using Visual Studio Code is a straightforward task. we will build a program that converts temperatures between Celsius and Fahrenheit scales.
Here's a step-by-step process  on how to create the temperature converter:

Step 1: Setup Visual Studio Code
If you haven't already installed Visual Studio Code and Java, you should do so first. Follow the official guides for installation.

Step 2: Create a new Java Project
Open Visual Studio Code and create a new folder for your project. Inside the folder, create a new Java file named "TemperatureConverter.java."

Step 3: Define the TemperatureConverter Class
Open "TemperatureConverter.java" and define the TemperatureConverter class. This class will contain the logic for temperature conversion.

java
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

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


Step 4: Compile and Run the Program
Open the terminal in Visual Studio Code and navigate to the folder containing "TemperatureConverter.java." Compile the Java file using the following command:
javac TemperatureConverter.java
This will generate a "TemperatureConverter.class" file. Now, run the program using the following command:
java TemperatureConverter

Step 5: Test the Temperature Converter
Once the program is running, it will prompt you to choose the conversion direction: Celsius to Fahrenheit or Fahrenheit to Celsius. Enter the appropriate choice, and then enter the temperature value to convert. The program will perform the conversion and display the result.

You can further improve this program by adding error handling for incorrect input and providing an option to repeat the conversion or exit the program.

This example gives you a basic foundation for a temperature converter in Java. You can build upon it and customize it according to your specific requirements.