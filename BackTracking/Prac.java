import java.util.*;

public class Prac {
    public static void main(String[] args) {
        // String str = "are you ready for hakatanakamuka";
        // String arrString[] = str.split(" ");
        // for (int i = arrString.length - 1; i >= 0; i--) {
        // String word = arrString[i];
        // char letters[] = word.toCharArray();
        // Arrays.sort(letters);
        // String sorted = new String(letters);
        // System.out.print(sorted + " ");
        // }

        // String string = "9785461201";
        // int input = (long)string;

        // long number = 9860857152L;
        // int n = 10, i = 0, j = 0;
        // long rem = 0;
        // long p[] = new long[n];
        // long sum = 0, count = 0;
        // while (number > 0) {
        // rem = number % 10;
        // p[i] = rem;
        // i++;
        // number /= 10;
        // }
        // for (i = 0, j = p.length - 1; i < j; i++, j--) {
        // long temp = p[i];
        // p[i] = p[j];
        // p[j] = temp;
        // }
        // for (i = 0; i < p.length; i++) {
        // long firstval = p[i];
        // // sum = firstval;
        // if ((firstval % 2) != 0) {
        // for (j = 0; j < p.length; j++) {
        // sum = sum + p[j];
        // if (sum % 2 == 0) {
        // System.out.println(sum);
        // break;
        // }
        // i = j;
        // // if (count == 1) {
        // // System.out.print(sum);
        // // break;
        // // }
        // }
        // }

        // if ((firstval % 2) == 0) {
        // for (j = 0; j < p.length; j++) {
        // sum = sum + p[j];
        // if (sum % 2 != 0) {
        // count++;
        // break;
        // }
        // if (count == 1) {
        // System.out.print(sum);
        // break;
        // }
        // }
        // }
        // }

        // String passWord = "P@ssword!";
        // int n = passWord.length();
        // if (checkString(passWord)) {
        // System.out.println("True");
        // } else {
        // System.out.println("False");
        // }

        // }

        // public static boolean checkString(String pass) {
        // int up = 0, lp = 0, dig = 0, sp = 0;
        // if (pass.length() >= 8) {
        // for (int i = 0; i < pass.length(); i++) {
        // char ch = pass.charAt(i);
        // if (Character.isUpperCase(ch)) {
        // up++;
        // } else if (Character.isLowerCase(ch)) {
        // lp++;
        // } else if (Character.isDigit(ch)) {
        // dig++;
        // } else {
        // sp++;
        // }
        // }
        // } else {
        // return false;
        // }
        // return up > 0 && lp > 0 && sp > 0 && dig > 0;
        // }

        // String string = "Wipro Limited";
        // int input[] = { 15, 16, 1, -2, -13, 61, 11, 4, 3, 19, -4, 17, -3,
        // 90, -65, 67, 12, 0, 13, 2, 3, 43, 21, -17, 2, 42 };
        // // System.out.println(input.length);
        // String arrString[] = string.split(" ");
        // int sum = 0;

        // for (int i = 0; i < arrString.length; i++) {
        // String word = arrString[i];
        // String sorted = word.toUpperCase();
        // // char ch = 'W';
        // // int aval = (int) ch;
        // // System.out.println(aval);
        // for (int j = 0; j < sorted.length(); j++) {
        // char ch = sorted.charAt(j);
        // int aval = (int) ch - 65;
        // if (j == input.length - 1 || j == 0) {
        // ch = sorted.charAt(j);
        // aval = (int) ch - 65;
        // if (input[aval] < 0) {
        // sum = input[aval] + (aval + 1);
        // }
        // }
        // sum = sum + input[aval];

        // }
        // System.out.print(sum + " ");

        // }

        // String str = "eng456ineer765ing78";

        // int n = str.length();
        // String newstr = "";
        // String sor = str.toLowerCase();

        // for (int i = 0; i < n; i++) {
        // char ch = str.charAt(i);
        // if (Character.isLowerCase(ch)) {
        // newstr += ch;
        // }

        // if(Character.isDigit(ch)){

        // }
        // }
        // System.out.println(newstr);

        int tiles[] = { 1, 5, 10 };

        int space = 15;
        int sum = 0;
        for (int i = tiles.length - 1; i >= 0; i--) {
            int val = space / tiles[i];
            int res = val * space;
            sum = sum + res;
            if (sum > space) {
                System.out.println(space);
            }
        }
    }
}
