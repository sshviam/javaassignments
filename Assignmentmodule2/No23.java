package Assignmentmodule2;

class ParentClass {
    public void printParent() {
        System.out.println("This is a parent class");
    }
}

class ChildClass extends ParentClass {
    public void printChild() {
        System.out.println("This is a child class");
    }
}

public class No23 {
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        ChildClass childObj = new ChildClass();

        // Call method of parent class by object of parent class
        parentObj.printParent();

        // Call method of child class by object of child class
        childObj.printChild();

        // Call method of parent class by object of child class
        childObj.printParent();
    }
}

