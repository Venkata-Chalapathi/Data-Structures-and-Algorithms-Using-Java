import java.util.*;

public class Sorting {

    public static void bubbleSort(int array[]) {
        for (int turn = 0; turn < array.length; turn++) {
            for (int j = 0; j < array.length - 1 - turn; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void printArr(int array[]) {
        System.err.println("After Sorting : ");
        for (int turn = 0; turn < array.length; turn++) {
            System.out.print(array[turn] + " ");
        }
    }

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int currPos = array[i];
            int prevPos = i - 1;

            while (prevPos >= 0 && array[prevPos] > currPos) {
                array[prevPos + 1] = array[prevPos];
                prevPos--;
            }
            array[prevPos + 1] = currPos;
        }
    }

    public static void countingSort(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        // int array[] = { 5, 1, 4, 3, 2 };
        int array[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        // bubbleSort(array);
        // selectionSort(array);
        // insertionSort(array);
        countingSort(array);
        printArr(array);
    }
}
