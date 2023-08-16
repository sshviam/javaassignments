package Assignmentmodule2;
import java.util.ArrayList;

public class No52 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        
        int indexToUpdate = 2;
        String newFruit = "Grapes";
        
        if (indexToUpdate >= 0 && indexToUpdate < fruits.size()) {
            fruits.set(indexToUpdate, newFruit);
            System.out.println("Updated ArrayList fruits: " + fruits);
        } else {
            System.out.println("Invalid index.");
        }
    }
}

