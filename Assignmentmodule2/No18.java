package Assignmentmodule2;

public class No18 {
    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "def";

        findInterleavings("", string1, string2);
    }

    public static void findInterleavings(String interleaving, String remaining1, String remaining2) {
        if (remaining1.isEmpty() && remaining2.isEmpty()) {
            System.out.println(interleaving);
            return;
        }

        if (!remaining1.isEmpty()) {
            findInterleavings(interleaving + remaining1.charAt(0), remaining1.substring(1), remaining2);
        }

        if (!remaining2.isEmpty()) {
            findInterleavings(interleaving + remaining2.charAt(0), remaining1, remaining2.substring(1));
        }
    }
}
