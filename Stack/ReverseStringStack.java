
import java.util.Stack;

public class ReverseStringStack {

    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder res = new StringBuilder("");
        while (!s.isEmpty()) {
            char currChar = s.pop();
            res.append(currChar);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String str = "madam";
        String result = reverseString(str);
        System.out.println(result);
        if (str.equals(result)) {
            System.out.println("Pal");
        } else {
            System.out.println("Not");
        }
    }
}
