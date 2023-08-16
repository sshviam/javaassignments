package Assignmentmodule2;

public class No20 {

    public void printn(int number) {
        System.out.println("Printing int: " + number);
    }

    public void printn(double number) {
        System.out.println("Printing double: " + number);
    }

    public void printn(long number) {
        System.out.println("Printing long: " + number);
    }

    public void printn(float number) {
        System.out.println("Printing float: " + number);
    }

    public static void main(String[] args) {
        No20 printer = new No20();

        int intValue = 10;
        double doubleValue = 3.14;
        long longValue = 1000000000L;
        float floatValue = 1.23f;

        printer.printn(intValue);
        printer.printn(doubleValue);
        printer.printn(longValue);
        printer.printn(floatValue);
    }
}
