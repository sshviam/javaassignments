package Assignmentmodule2;

abstract class Shape {
    public abstract double RectangleArea(double length, double breadth);
    public abstract double SquareArea(double side);
    public abstract double CircleArea(double radius);
}

class Area extends Shape {
    @Override
    public double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    public double SquareArea(double side) {
        return side * side;
    }

    @Override
    public double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class No32 {
    public static void main(String[] args) {
        Area areaCalculator = new Area();

        double rectangleArea = areaCalculator.RectangleArea(5.0, 10.0);
        double squareArea = areaCalculator.SquareArea(7.0);
        double circleArea = areaCalculator.CircleArea(4.0);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Circle Area: " + circleArea);
    }
}

