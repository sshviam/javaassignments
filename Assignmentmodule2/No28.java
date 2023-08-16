package Assignmentmodule2;

abstract class Parent {
    public abstract void message();
}

class FirstSubclass extends Parent {
    @Override
    public void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
    @Override
    public void message() {
        System.out.println("This is second subclass");
    }
}

public class No28 {
    public static void main(String[] args) {
        Parent firstObj = new FirstSubclass();
        Parent secondObj = new SecondSubclass();

        firstObj.message();
        secondObj.message();
    }
}

