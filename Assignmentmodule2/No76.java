package Assignmentmodule2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class No76 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Value 1");
        map.put(2, "Value 2");
        map.put(3, "Value 3");

        Collection<String> values = map.values();

        System.out.println("Collection view of values:");
        for (String value : values) {
            System.out.println(value);
        }
    }
}

