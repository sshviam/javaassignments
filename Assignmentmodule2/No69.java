package Assignmentmodule2;

import java.util.HashSet;

public class No69 {
    public static void main(String[] args) {
        HashSet<String> colorsSet = new HashSet<>();
        
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        colorsSet.add("Yellow");
        
        String[] colorsArray = new String[colorsSet.size()];
        colorsSet.toArray(colorsArray);
        
        System.out.println("HashSet elements:");
        for (String color : colorsArray) {
            System.out.println(color);
        }
    }
}

