package Assignmentmodule2;
import java.util.HashMap;

public class No62 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        
        int newKey = 104;
        String newValue = "David";
        
        studentMap.put(newKey, newValue);
        
        System.out.println("HashMap after putting new key-value pair:");
        System.out.println(studentMap);
    }
}

