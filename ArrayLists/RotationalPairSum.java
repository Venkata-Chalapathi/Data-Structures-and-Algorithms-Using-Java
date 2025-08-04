import java.util.ArrayList;

public class RotationalPairSum {

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int pivot = -1;

        // Finding pivot
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        // Find Target

        int lp = pivot + 1;
        int rp = pivot;
        // int n = list.size();
        while (lp != rp) {

            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % list.size();
            } else {
                rp = (list.size() + rp - 1) % list.size();
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        // System.out.println(list);

        int target = 25;
        System.out.println(pairSum(list, target));

    }
}
