import java.util.*;

public class Subsets {

    public static void findSubets(String str, String ans, int i) {
        // Base Case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // Recursion
        // Yes Choice
        findSubets(str, ans + str.charAt(i), i + 1);
        // No Choice
        findSubets(str, ans, i + 1);
    }

    public static void main(String[] args) {

        String str = "abc";
        findSubets(str, "", 0);
    }
}