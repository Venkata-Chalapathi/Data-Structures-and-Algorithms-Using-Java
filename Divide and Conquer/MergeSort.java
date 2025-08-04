import java.util.*;

public class MergeSort {

    public static void printArr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int array[], int si, int ei) {
        // BASE CASE
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // Find Mid
        mergeSort(array, si, mid); // Left Part
        mergeSort(array, mid + 1, ei); // Right Part
        merge(array, si, mid, ei); // Merge BOth
    }

    public static void merge(int array[], int si, int mid, int ei) {

        int tempArr[] = new int[ei - si + 1];

        int i = si; // Iterator for left Part
        int j = mid + 1; // Iterator for right part
        int k = 0; // Iterator for tempArr

        while (i <= mid && j <= ei) {
            if (array[i] < array[j]) {
                tempArr[k] = array[i];
                i++;
            } else {
                tempArr[k] = array[j];
                j++;
            }
            k++;
        }
        // For Remaining Elements in Left and Right
        // For Left
        while (i <= mid) {
            tempArr[k++] = array[i++];
        }
        // For Right Part
        while (j <= ei) {
            tempArr[k++] = array[j++];
        }
        // Copy to OriginalArray
        for (k = 0, i = si; k < tempArr.length; k++, i++) {
            array[i] = tempArr[k];
        }
    }

    public static void main(String[] args) {
        int array[] = { 6, 3, 8, 7, 1, 5 };
        mergeSort(array, 0, array.length - 1);
        printArr(array);
    }
}