package Assignmentmodule2;

public class No40 {
    public static void main(String[] args) {
        try {
            validate(16); // Change the value to test different ages
            System.out.println("Welcome to vote!");
        } catch (ArithmeticException e) {
            System.out.println("Sorry, you're not eligible to vote.");
        }
    }

    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18.");
        }
    }
}

