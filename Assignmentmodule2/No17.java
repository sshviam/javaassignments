package Assignmentmodule2;

public class No17 {
    public static void main(String[] args) {
        String mainString1 = "Red is favorite color.";
        String checkString1 = "Red";
        
        String mainString2 = "Orange is also my favorite color.";
        String checkString2 = "Red";
        
        boolean startsWithResult1 = mainString1.startsWith(checkString1);
        boolean startsWithResult2 = mainString2.startsWith(checkString2);
        
        System.out.println(mainString1 + " Starts with " + checkString1 + "? " + startsWithResult1);
        System.out.println(mainString2 + " Starts with " + checkString2 + "? " + startsWithResult2);
    }
}

