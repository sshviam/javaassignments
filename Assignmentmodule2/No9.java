package Assignmentmodule2;
import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else {
                otherCount++;
            }
        }
        
        System.out.println("Letter count: " + letterCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Number count: " + numberCount);
        System.out.println("Other character count: " + otherCount);
        
        sc.close();
    }
}

