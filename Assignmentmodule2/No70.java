package Assignmentmodule2;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class No70 {
    public static void main(String[] args) {
        HashSet<String> colorsSet = new HashSet<>();
        
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        colorsSet.add("Yellow");
        
        List<String> colorsList = new ArrayList<>(colorsSet);
        
        System.out.println("Converted ArrayList:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}

