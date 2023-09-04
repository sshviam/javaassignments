package Assignmentmodule2;

import java.util.HashMap;
import java.util.Map;

public class No71 {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Check if the map is empty
        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }

        map.put("A", 1);
        map.put("B", 2);

        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }
    }
}

