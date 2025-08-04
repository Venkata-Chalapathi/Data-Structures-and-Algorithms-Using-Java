import java.util.*;

public class QuickSort {

    public static void printArr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int array[], int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }
        // Last Element
        int pIdx = partition(array, si, ei);
        quickSort(array, si, pIdx - 1); // left
        quickSort(array, pIdx + 1, ei); // right

    }

    public static int partition(int array[], int si, int ei) {
        // Last Element
        int pivot = array[ei];
        int i = si - 1; // to create place

        for (int j = si; j < ei; j++) {
            if (array[j] <= pivot) {
                i++;
                // swap
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        array[ei] = array[i];
        array[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int array[] = { 6, 3, 8, 7, 1, 5 };
        quickSort(array, 0, array.length - 1);
        printArr(array);
    }
}
