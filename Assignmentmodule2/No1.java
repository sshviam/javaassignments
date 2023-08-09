package Assignmentmodule2;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        
        int greatest = num1;
        
        if (num2 > greatest) {
            greatest = num2;
        }
        
        if (num3 > greatest) {
            greatest = num3;
        }
        
        System.out.println("The greatest number is: " + greatest);
        
        sc.close();
    }
}

