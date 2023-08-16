package Assignmentmodule2;

public class No24 {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    // Constructor
    public No24(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void printSalary() {
        System.out.println("Salary of " + name + ": " + salary);
    }

    public static void main(String[] args) {
        No24 member = new No24("Batman", 58, "1234567890", "Gotham city", 50000.0);

        System.out.println("Name: " + member.getName());
        System.out.println("Age: " + member.getAge());
        System.out.println("Phone Number: " + member.getPhoneNumber());
        System.out.println("Address: " + member.getAddress());
        System.out.println("Salary: " + member.getSalary());
        member.printSalary();
    }
}

