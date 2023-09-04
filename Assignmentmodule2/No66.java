package Assignmentmodule2;

import java.util.ArrayList;
import java.util.Arrays;

public class No66 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Apple", "Mango", "Orange"));
        
        System.out.println("Comparing list1 and list2: " + list1.equals(list2));
        System.out.println("Comparing list1 and list3: " + list1.equals(list3));
    }
}

