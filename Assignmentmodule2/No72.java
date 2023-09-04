package Assignmentmodule2;

import java.util.ArrayList;

public class No72 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(20);

        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList contents:");
        for (String item : arrayList) {
            System.out.println(item);
        }
    }
}

