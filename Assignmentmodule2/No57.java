package Assignmentmodule2;
import java.util.ArrayList;
import java.util.Collections;

public class No57 {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Ace");
        cards.add("2");
        cards.add("3");
        cards.add("4");
        cards.add("5");
        cards.add("6");
        cards.add("7");
        cards.add("8");
        cards.add("9");
        cards.add("10");
        cards.add("Jack");
        cards.add("Queen");
        cards.add("King");
        
        System.out.println("Original ArrayList cards: " + cards);

        Collections.shuffle(cards);

        System.out.println("Shuffled ArrayList cards: " + cards);
    }
}

