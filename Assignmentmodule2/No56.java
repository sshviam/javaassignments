package Assignmentmodule2;
import java.util.ArrayList;
import java.util.Collections;

public class No56 {
    public static void main(String[] args) {
        ArrayList<Integer> sourceList = new ArrayList<>();
        sourceList.add(5);
        sourceList.add(2);
        sourceList.add(8);
        sourceList.add(1);
        sourceList.add(9);
        
        ArrayList<Integer> destinationList = new ArrayList<>(sourceList);

        System.out.println("Source ArrayList: " + sourceList);
        System.out.println("Destination ArrayList: " + destinationList);
    }
}

