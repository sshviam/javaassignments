package Assignmentmodule2;

public class No38 {
    public static void main(String[] args) {
        try {
            try {
                int[] a = new int[5];
                a[5] = 30 / 0;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index out of bounds.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

