import java.util.ArrayList;
import java.util.Collections;

public class PracAList {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {

        int temp1 = list.get(idx1);
        int temp2 = list.get(idx2);
        list.set(idx1, temp2);
        list.set(idx2, temp1);

        System.out.println(list);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // ADD ELEMENT

        list.add(1);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(6);

        // System.out.println(list);

        // // GET ELEMENT

        // int getEle = list.get(2);
        // System.out.println(getEle);

        // // REMOVE ELEMENT

        // list.remove(3);
        // System.out.println(list);

        // SET ELEMENT

        // list.set(1, 20);
        // System.out.println(list);

        // CONTAINS
        // System.out.println(list);
        // System.out.println(list.contains(100));

        // System.out.println(list.size());

        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // REVERSE ARRAYLIST

        // for (int i = list.size() - 1; i >= 0; i--) {
        // System.out.print(list.get(i) + " ");
        // }

        // MAX IN ARRAY LIST

        // int max = Integer.MIN_VALUE;

        // for (int i = 0; i < list.size(); i++) {
        // if (list.get(i) > max) {
        // max = list.get(i);
        // }
        // }

        // System.out.println(max);

        // SWAP 2 NUMBERS

        // int idx1 = 1, idx2 = 3;
        // swap(list, idx1, idx2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
