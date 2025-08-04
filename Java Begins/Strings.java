import java.util.*;

public class Strings {

    public static void printLetters(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float shortestPath(String str) {
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static String subString(String name, int sidx, int eidx) {

        String substring = "";
        for (int i = sidx; i < eidx; i++) {
            substring += name.charAt(i);
        }
        return substring;
    }

    public static String toUpperCase(String str) {

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compressedString(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // String name = "G Venkata Chalapathi";
        // System.out.println("Length : " + name.length());

        // String firstName = "Venkata Chalapathi";
        // String lastName = "Gujjala";
        // System.out.println("Full Name : " + firstName + " " + lastName);
        // System.out.println();
        // printLetters(name);

        Scanner sc = new Scanner(System.in);
        // String str = "WNEENESENNN";
        // System.out.println(palindrome(str));
        // System.out.println(shortestPath(str));

        // if (firstName.equals(lastName)) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not Equal");
        // }
        // System.out.println(subString(name, 2, 5));

        // String fruits[] = { "apple", "mango", "banana" };

        // String largest = fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        // if (largest.compareTo(fruits[i]) < 0) {
        // largest = fruits[i];
        // }
        // }
        // System.out.println("Largest Fruit : " + largest);

        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch < 'z'; ch++) {
        // sb.append(ch);
        // }
        // System.out.println(sb + " ");
        String str = "aaabbbcccdd";
        // System.out.println(toUpperCase(str));
        System.out.println(compressedString(str));
    }
}