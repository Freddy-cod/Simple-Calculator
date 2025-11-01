import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter second number: ");
        String input2 = scanner.nextLine();

        try {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            System.out.println("Addition: " + calc.add(num1, num2));
            System.out.println("Multiplication: " + calc.multiply(num1, num2));
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }
    }
}
