package Assignmentmodule2;

import java.util.ArrayList;

public class No68 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Orange");
        list2.add("Mango");
        
        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        
        System.out.println("Joined ArrayList: " + joinedList);
    }
}

