package Assignmentmodule2;

import java.util.ArrayList;
import java.util.List;

public class No73 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");

        System.out.println("Original ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        String newElement = "New Item 2";

        if (arrayList.size() >= 2) {
            arrayList.set(1, newElement);
        }

        System.out.println("\nArrayList after replacing the second element:");
        for (String item : arrayList) {
            System.out.println(item);
        }
    }
}

