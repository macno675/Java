import java.util.Scanner;

public class PerimeterOfTheRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstSide;
        double secondSide;

        try {
            System.out.print("Enter the length of the first side of the rectangle: ");
            firstSide = scanner.nextDouble();

            System.out.print("Enter the length of the second side of the rectangle: ");
            secondSide = scanner.nextDouble();
            scanner.nextLine();

            if (firstSide <= 0 || secondSide <= 0) {
                System.out.println("Error: Side lengths must be greater than zero!");
                return;
            }

            double perimeter = 2 * (firstSide + secondSide);
            double area = firstSide * secondSide;

            System.out.printf("Perimeter of the rectangle: %.2f%n", perimeter);
            System.out.printf("Area of the rectangle: %.2f%n", area);
        } catch (Exception e) {
            System.out.println("Error: Invalid value");
        } finally {
            scanner.close();
        }
    }
}
