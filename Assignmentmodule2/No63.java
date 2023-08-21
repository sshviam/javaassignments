package Assignmentmodule2;
import java.util.HashMap;
import java.util.Map;

public class No63 {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);
        
        int size = ageMap.size();
        
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}

