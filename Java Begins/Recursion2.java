import java.util.*;

public class Recursion2 {

    public static int tillingProblem(int n) { // 2 x n ( floor Size )

        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Vertical Choice
        int fnm1 = tillingProblem(n - 1);

        // Horizontal Choice
        int fnm2 = tillingProblem(n - 2);

        int totWays = fnm1 + fnm2;

        return totWays;

    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {

        // Base Case

        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Logic

        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }

    // public static void panGram(String str, boolean map[]){

    // for (int i = 0; i < str.length(); i++){
    // char currChar = str.charAt(i);
    // if()
    // }
    // }
    public static int friendsPairing(int n) {

        if (n == 1 || n == 2) {
            return n;
        }
        // Choice
        // Single
        int fnm1 = friendsPairing(n - 1);
        // pairing
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        int totWays = fnm1 + pairWays;

        return totWays;
    }

    public static void printBinaryStrings(int n, int lastPlace, String str) {

        // Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Logic
        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        // int n = 4;
        // int res = tillingProblem(n);
        // System.out.println("Total Ways = " + res);

        String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // int res = friendsPairing(3);
        // System.out.println(res);

        printBinaryStrings(3, 0, "");
    }

}
