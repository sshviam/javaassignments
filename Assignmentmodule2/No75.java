package Assignmentmodule2;

import java.util.HashSet;
import java.util.Set;

public class No75 {
    public static void main(String[] args) {
        // Create the first set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Create the second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Retain elements that are the same in both sets
        set1.retainAll(set2);

        // Print the retained elements
        System.out.println("Elements retained in both sets:");
        for (Integer element : set1) {
            System.out.println(element);
        }
    }
}

