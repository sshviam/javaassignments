package Assignmentmodule2;

public class No22 {

    public void printArea(int side) {
        int squareArea = side * side;
        System.out.println("Area of the square with side " + side + ": " + squareArea);
    }

    public void printArea(int length, int breadth) {
        int rectangleArea = length * breadth;
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + ": " + rectangleArea);
    }

    public static void main(String[] args) {
        No22 calculator = new No22();

        int squareSide = 5;
        int rectangleLength = 8;
        int rectangleBreadth = 12;

        calculator.printArea(squareSide);
        calculator.printArea(rectangleLength, rectangleBreadth);
    }
}
