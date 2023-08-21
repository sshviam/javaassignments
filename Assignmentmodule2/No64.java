package Assignmentmodule2;
import java.util.ArrayList;
import java.util.Collections;

public class No64 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        System.out.println("Original ArrayList colors: " + colors);
        
        Collections.reverse(colors);
        
        System.out.println("Reversed ArrayList colors: " + colors);
    }
}

