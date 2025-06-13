import java.util.Scanner;

public class NumberParity {
    static void checkIfEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        try {
            int number = scanner.nextInt();
            checkIfEven(number);
        } catch (Exception e) {
            System.out.println("Error: Invalid number!");
        } finally {
            scanner.close();
        }
    }
}
