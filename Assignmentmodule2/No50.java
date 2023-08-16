package Assignmentmodule2;
import java.util.ArrayList;

public class No50 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        colors.add(0, "Orange");
        
        System.out.println("Updated ArrayList colors: " + colors);
    }
}

