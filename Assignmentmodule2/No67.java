package Assignmentmodule2;

import java.util.ArrayList;
import java.util.Collections;

public class No67 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        int index1 = 1; // Index of the first element to swap
        int index2 = 3; // Index of the second element to swap
        
        if (index1 >= 0 && index1 < colors.size() && index2 >= 0 && index2 < colors.size()) {
            Collections.swap(colors, index1, index2);
            System.out.println("ArrayList after swapping elements:");
            System.out.println(colors);
        } else {
            System.out.println("Invalid indices.");
        }
    }
}

