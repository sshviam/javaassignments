package Assignmentmodule2;
import java.util.ArrayList;

public class No53 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        int indexToRemove = 2; // Index of the third element
        
        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            String removedColor = colors.remove(indexToRemove);
            System.out.println("Removed color: " + removedColor);
            System.out.println("Updated ArrayList colors: " + colors);
        } else {
            System.out.println("Invalid index.");
        }
    }
}

