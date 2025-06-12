import java.util.Scanner;

public class SoftCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = 0;
        double secondNumber = 0;

        try {
            System.out.print("First number: ");
            firstNumber = scanner.nextDouble();

            System.out.print("Second number: ");
            secondNumber = scanner.nextDouble();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: this is not a valid number!");
            scanner.close();
            return;
        }

        System.out.print("Operation(+, -, *, /): ");
        String operation = scanner.nextLine();

        if (operation.equals("+")) {
            System.out.println("Result: " + (firstNumber + secondNumber));
        } else if (operation.equals("-")) {
            System.out.println("Result: " + (firstNumber - secondNumber));
        } else if (operation.equals("*")) {
            System.out.println("Result: " + (firstNumber * secondNumber));
        } else if (operation.equals("/")) {
            if (secondNumber == 0) {
                System.out.println("Error: you can't divide by zero!");
            } else {
                System.out.println("Result: " + (firstNumber / secondNumber));
            }
        } else {
            System.out.println("Error: unknow operation!");
        }

        scanner.close();
    }
}
