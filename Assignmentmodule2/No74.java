package Assignmentmodule2;

import java.util.ArrayList;
import java.util.List;

public class No74 {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");
        arrayList.add("Item 4");

        // Print all elements of the ArrayList by position
        System.out.println("Elements of the ArrayList by position:");
        for (int i = 0; i < arrayList.size(); i++) {
            String element = arrayList.get(i);
            System.out.println("Position " + i + ": " + element);
        }
    }
}

