package Assignmentmodule2;
import java.util.HashSet;

public class No59 {
    public static void main(String[] args) {
        HashSet<String> namesSet = new HashSet<>();
        
        namesSet.add("Alice");
        namesSet.add("Bob");
        namesSet.add("Charlie");
        
        String newElement = "David";
        
        System.out.println("Original HashSet: " + namesSet);
        
        namesSet.add(newElement);
        
        System.out.println("HashSet after appending " + newElement + ": " + namesSet);
    }
}

