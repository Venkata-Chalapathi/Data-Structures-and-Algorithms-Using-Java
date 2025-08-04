import java.util.*;

public class SortedandRotatedArray {

    public static int search(int array[], int target, int si, int ei) {

        // Base Case
        if (si > ei) {
            return -1;
        }
        // Mid
        int mid = si + (ei - si) / 2;

        // Case FOUND
        if (array[mid] == target) {
            return mid;
        }
        // mid on L1

        if (array[si] <= array[mid]) {

            // Case a : left
            if (array[si] <= target && target <= array[mid]) {
                return search(array, target, si, mid - 1);
            } else {
                // Case b Right
                return search(array, target, mid + 1, ei);
            }
        }

        // mid on L2
        else {
            // Case c : right
            if (array[mid] <= target && target <= array[ei]) {
                return search(array, target, mid + 1, ei);
            } else {
                // Case d : Left
                return search(array, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = search(array, target, 0, array.length - 1);
        System.out.println(tarIdx);
    }
}
