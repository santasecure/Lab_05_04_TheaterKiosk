//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Input age, if age >= 21 output wristband message, otherwise do nothing

        // Declare variables
        int age = 0;

        // Create scanner for input
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your age: ");
        age = input.nextInt();

        // If condition
        if (age >= 21) {
            System.out.println("You get a wristband.");
        }

        input.close();
    }
}