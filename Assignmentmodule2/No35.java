package Assignmentmodule2;
import java.util.Scanner;

public class No35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            int num = scanner.nextInt();
            int result = 10 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        } finally {
            System.out.println("Execution completed.");
            scanner.close();
        }
    }
}

