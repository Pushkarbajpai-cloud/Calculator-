import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Java Calculator ===");
        System.out.println("Operators: +  -  *  /");
        System.out.println("Type 'q' to quit.\n");

        while (true) {
            System.out.print("Enter first number (or 'q' to quit): ");
            String firstInput = sc.nextLine().trim();
            if (firstInput.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                break;
            }

            double a;
            try {
                a = Double.parseDouble(firstInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.\n");
                continue;
            }

            System.out.print("Enter operator (+, -, *, /): ");
            String op = sc.nextLine().trim();

            if (op.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                break;
            }

            if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
                System.out.println("Invalid operator. Try again.\n");
                continue;
            }

            System.out.print("Enter second number: ");
            String secondInput = sc.nextLine().trim();
            double b;
            try {
                b = Double.parseDouble(secondInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.\n");
                continue;
            }

            if (op.equals("/")) {
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.\n");
                    continue;
                }
                System.out.println("Result: " + (a / b) + "\n");
            } else if (op.equals("+")) {
                System.out.println("Result: " + (a + b) + "\n");
            } else if (op.equals("-")) {
                System.out.println("Result: " + (a - b) + "\n");
            } else { // op.equals("*")
                System.out.println("Result: " + (a * b) + "\n");
            }
        }

        sc.close();
    }
}

