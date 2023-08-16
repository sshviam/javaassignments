package Assignmentmodule2;

class Shape {
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    public void displayRectangle() {
        System.out.println("This is a rectangular shape.");
    }
}

class Circle extends Shape {
    public void displayCircle() {
        System.out.println("This is a circular shape.");
    }
}

class Square extends Rectangle {
    public void displaySquare() {
        System.out.println("Square is a rectangle.");
    }
}

public class No34 {
    public static void main(String[] args) {
        Square square = new Square();

        square.displayShape();     // Calling method from Shape class
        square.displayRectangle(); // Calling method from Rectangle class
        square.displaySquare();    // Calling method from Square class
    }
}

