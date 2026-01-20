package tejal;


import java.util.Scanner;

public class task4 {

    private static double getValidNumber(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
            }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // Method overloading – add(double, double)
    public static double add(double a, double b) {
        return a + b;
    }

    // Method overloading – subtract
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method overloading – multiply
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division with exception handling
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero error");
        }
        return a / b;
    }

    // Demonstrating pass-by-value (swap does NOT change original values)
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Inside swap: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Test Pass-by-Value");
            System.out.println("6. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                	
                    System.out.println("Add integers: " + add(5, 3));
                    System.out.println("Add doubles: " + add(5.5, 3.2));
                    break;
                case 2:
                    System.out.println("Subtract integers: " + subtract(10, 4));
                    System.out.println("Subtract doubles: " + subtract(10.5, 4.2));
                    break;
                case 3:
                    System.out.println("Multiply integers: " + multiply(6, 7));
                    System.out.println("Multiply doubles: " + multiply(6.3, 2.5));
                    break;
                case 4:
                    try {
                        double num1 = getValidNumber("Enter dividend: ");
                        double num2 = getValidNumber("Enter divisor: ");
                        System.out.println("Result: " + divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    int a = 10, b = 20;
                    System.out.println("Before swap: a = " + a + ", b = " + b);
                    swap(a, b);
                    System.out.println("After swap: a = " + a + ", b = " + b);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}
