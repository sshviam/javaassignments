package Assignmentmodule2;
import java.util.HashSet;

public class No61 {
    public static void main(String[] args) {
        HashSet<String> colorsSet = new HashSet<>();
        
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        colorsSet.add("Yellow");
        
        int size = colorsSet.size();
        
        System.out.println("Number of elements in the HashSet: " + size);
    }
}

