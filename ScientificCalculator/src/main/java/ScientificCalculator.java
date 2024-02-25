import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function (√x)");
            System.out.println("2. Factorial function (x!)");
            System.out.println("3. Natural logarithm function (ln(x))");
            System.out.println("4. Power function (x^b)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to find square root: ");
                    double numSqrt = scanner.nextDouble();
                    System.out.println("Square root of " + numSqrt + " is: " + sqrt(numSqrt));
                    break;
                case 2:
                    System.out.print("Enter the number to find factorial: ");
                    int numFact = scanner.nextInt();
                    System.out.println("Factorial of " + numFact + " is: " + factorial(numFact));
                    break;
                case 3:
                    System.out.print("Enter the number to find natural logarithm: ");
                    double numLn = scanner.nextDouble();
                    System.out.println("Natural logarithm of " + numLn + " is: " + ln(numLn));
                    break;
                case 4:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + " raised to the power " + exponent + " is: " + power(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
 
        scanner.close();
    }

    // Square root function
    public static double sqrt(double x) {
        return Math.sqrt(x);
    }

    // Factorial function
    public static int factorial(int x) {
        if (x == 0)
            return 1;
        else
            return x * factorial(x - 1);
    }

    // Natural logarithm function
    public static double ln(double x) {
        return Math.log(x);
    }

    // Power function
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
