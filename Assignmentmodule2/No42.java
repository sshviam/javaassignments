package Assignmentmodule2;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
        this.age = age;
        
        if (!name.matches("^[a-zA-Z]*$")) {
            throw new NameNotValidException("Name should only contain letters.");
        }
        this.name = name;

        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class No42 {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(101, "John", 18, "Science");
            student1.displayInfo();

            Student student2 = new Student(102, "Alice#23", 20, "Arts");
            student2.displayInfo(); // This will raise NameNotValidException

            Student student3 = new Student(103, "Robert", 22, "Commerce");
            student3.displayInfo(); // This will raise AgeNotWithinRangeException
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

