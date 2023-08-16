package Assignmentmodule2;

public class No16 {
    public static void main(String[] args) {
        String string1 = "topsint.com";
        String string2 = "topsint.com";
        String string3 = "Topsint.com";
        
        boolean compareResult1 = string1.equals(string2);
        boolean compareResult2 = string2.equals(string3);
        
        System.out.println("Comparing " + string1 + " and " + string2 + ": " + compareResult1);
        System.out.println("Comparing " + string2 + " and " + string3 + ": " + compareResult2);
    }
}
