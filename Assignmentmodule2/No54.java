package Assignmentmodule2;
import java.util.ArrayList;

public class No54 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        String searchColor = "Green"; // Element to search
        
        if (colors.contains(searchColor)) {
            System.out.println(searchColor + " found in the ArrayList.");
        } else {
            System.out.println(searchColor + " not found in the ArrayList.");
        }
    }
}

