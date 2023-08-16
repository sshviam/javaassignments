package Assignmentmodule2;
import java.util.ArrayList;

public class No49 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        
        System.out.println("Iterating through ArrayList fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

