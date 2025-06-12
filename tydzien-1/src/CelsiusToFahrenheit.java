import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = 0;

        System.out.print("Please enter the temperature: ");
        try {
            temperature = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: Invalid temperature input!");
            scanner.close();
            return;
        }

        System.out.print("(C - Celsius, F - Fahrenheit). Your temperature is: " + temperature + " ");
        String option = scanner.nextLine().trim().toUpperCase();

        double result;
        switch (option) {
            case "C":
                result = (temperature * 2) + 32;
                System.out.println("Result is: " + result + " °F");
                break;
            case "F":
                result = (temperature - 32) / 2;
                System.out.println("Result is: " + result + " °C");
                break;
            default:
                System.out.println("Error: Invalid conversion option! Use 'C' or 'F'.");
        }
    }
}
