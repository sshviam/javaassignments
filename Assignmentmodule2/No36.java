package Assignmentmodule2;
import java.util.Scanner;

public class No36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();
            
            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        } finally {
            scanner.close();
        }
    }
}

