import java.util.*;

public class Permutations {

    public static void findPermutations(String str, String ans) {
        // Base Case

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            // Remove ele
            String newString = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newString, ans + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
