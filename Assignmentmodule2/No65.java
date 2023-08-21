package Assignmentmodule2;
import java.util.ArrayList;

public class No65 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        int fromIndex = 1; // Index of the starting element to extract
        int toIndex = 4;   // Index of the element after the last element to extract
        
        if (fromIndex >= 0 && toIndex <= numbers.size() && fromIndex <= toIndex) {
            ArrayList<Integer> extractedPortion = new ArrayList<>(numbers.subList(fromIndex, toIndex));
            System.out.println("Extracted portion: " + extractedPortion);
        } else {
            System.out.println("Invalid indices.");
        }
    }
}

