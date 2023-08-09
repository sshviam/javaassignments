package Assignmentmodule2;
import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int digitCount = countDigits(number);
            System.out.println("Number of digits: " + digitCount);
        }
        
        sc.close();
    }
    
    public static int countDigits(int num) {
        if (num == 0) {
            return 1; // Special case for number 0
        }
        
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        
        return count;
    }
}
