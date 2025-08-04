import java.util.ArrayList;
import java.util.Collections;

public class PairSum {

    // public static void pairSum(ArrayList<Integer> list, int target) {
    // // BRUTE FORCE

    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // System.out.println("(" + list.get(i) + " " + list.get(j) + ")");
    // }
    // }
    // }
    // }

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {

            // Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // Case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } // Case 3
            else {
                rp--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);

        Collections.sort(list);

        int target = 5;

        System.out.println(pairSum(list, target));
    }
}
