package Assignmentmodule2;

import java.util.Scanner;

public class No5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalNumbers = 5;
        int sum = 0;
        
        for (int i = 1; i <= totalNumbers; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            sum += number;
        }
        
        double average = (double) sum / totalNumbers;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        sc.close();
    }
}
