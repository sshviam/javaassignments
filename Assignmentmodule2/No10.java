package Assignmentmodule2;
import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        int asciiValue = (int) ch;
        
        System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
        
        sc.close();
    }
}

