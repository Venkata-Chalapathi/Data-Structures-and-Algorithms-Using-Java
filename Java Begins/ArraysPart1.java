import java.util.*;

public class ArraysPart1 {

    public static int Linear_Search(int array[], int searchEle) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchEle) {
                return i;
            }
        }
        return -1;
    }

    public static void Largest_in_Array(int array[]) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum :" + max);
        System.out.println("Minimum :" + min);
    }

    public static int binarySearch(int array[], int key) {
        int start = 0;
        int end = array.length;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                start = mid + 1;
            } else {
                start = mid - 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int array[]) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void pairs_Array(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")");
            }
            System.out.println();
        }
    }

    public static void printSubArrays(int array[]) {
        System.out.println("After ");
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubArrays(int array[]) {
        System.out.println("After ");

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(array[k] + " ");
                    currSum += array[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println("Max Sum :" + maxSum);
    }

    public static void prefixSum(int array[]) {
        System.out.println("After ");

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];

        prefix[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // for (int k = start; k <= end; k++) {
                // // System.out.print(array[k] + " ");
                // currSum += array[k];
                // }
                // System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println("Max Sum :" + maxSum);
    }

    public static void kadanesAlogorithm(int array[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < array.length; i++) {
            cs = cs + array[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Maximum subarray Sum : " + ms);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int marks[] = new int[3];

        // for (int i = 0; i < marks.length; i++) {
        // marks[i] = sc.nextInt();
        // }
        // System.out.println("Marks entered :");
        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }

        System.out.println("Enter no of elements :");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // System.out.println("Enter element to find :");
        // int searchEle = sc.nextInt();
        // System.out.println("Enter element to find :");
        // int key = sc.nextInt();
        // int index = Linear_Search(array, searchEle);
        // if (index == -1) {
        // System.out.println("Element not Found!!!");
        // } else {
        // System.out.println("Key present at Index :" + index);
        // }
        // System.out.println("Element at index : " + binarySearch(array, key));
        // reverseArray(array);
        // pairs_Array(array);
        // printSubArrays(array);
        // maxSubArrays(array);
        // prefixSum(array);
        kadanesAlogorithm(array);
    }
}
