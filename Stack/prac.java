import java.util.*;

public class prac {

    public static void reverseString(String str, int i){
        if(str.length() == i){
            System.out.println(str.charAt(i));
        }
        String res = reverseString(str.charAt(i),i + 1);
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 6, 9, 10 };
        // int target = 9;
        // int found = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == target) {
        // System.out.println(i);
        // found = 1;
        // break;
        // }

        // }
        // if (found == 0) {
        // System.out.println("not found");
        // }


        // String stringarr[] = { "a", "m", "d", "s", "z", "e" };

        // for (int i = 0; i < stringarr.length - 1; i++) {
        //     for (int j = 1; j < stringarr.length - i - 1; j = j + 2) {
        //         if (stringarr[j].compareTo(stringarr[j + 2]) > 0) {
        //             String temp = stringarr[j];
        //             stringarr[j] = stringarr[j + 2];
        //             stringarr[j + 2] = temp;
        //         }
        //     }
        // }
        // for (int i = 0; i < stringarr.length; i++) {
        //     System.out.print(stringarr[i] + " ");
        
        // }


        String str = "cricket";
        reverseString(str, 0);
    }
}
