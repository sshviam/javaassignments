package Assignmentmodule2;

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 3.0;
        side2 = 4.0;
        side3 = 5.0;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

public class No26 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}

