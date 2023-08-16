package Assignmentmodule2;

public class No21 {

    public void print(int num, char ch) {
        System.out.println("Printing integer: " + num);
        System.out.println("Printing character: " + ch);
    }

    public void print(char ch, int num) {
        System.out.println("Printing character: " + ch);
        System.out.println("Printing integer: " + num);
    }

    public static void main(String[] args) {
        No21 printer = new No21();

        int intValue = 10;
        char charValue = 'A';

        // Call the methods with different parameter sequences
        printer.print(intValue, charValue);
        System.out.println();  // Adding a newline for separation
        printer.print(charValue, intValue);
    }
}

