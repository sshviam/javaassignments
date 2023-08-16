package Assignmentmodule2;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class No19 {
    public static void main(String[] args) {
        String inputString = "successes";
        char secondMostFrequent = findSecondMostFrequent(inputString);
        
        System.out.println("The given string is: " + inputString);
        System.out.println("The second most frequent char in the string is: " + secondMostFrequent);
    }
    
    public static char findSecondMostFrequent(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (entry1, entry2) -> entry2.getValue() - entry1.getValue()
        );
        maxHeap.addAll(charFrequency.entrySet());
        
        // Remove the most frequent character
        maxHeap.poll();
        
        // The top entry now is the second most frequent character
        return maxHeap.peek().getKey();
    }
}

