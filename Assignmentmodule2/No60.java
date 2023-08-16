package Assignmentmodule2;
import java.util.HashSet;

public class No60 {
    public static void main(String[] args) {
        HashSet<String> fruitsSet = new HashSet<>();
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Orange");
        fruitsSet.add("Mango");
        
        System.out.println("Iterating through HashSet fruits:");
        for (String fruit : fruitsSet) {
            System.out.println(fruit);
        }
    }
}

