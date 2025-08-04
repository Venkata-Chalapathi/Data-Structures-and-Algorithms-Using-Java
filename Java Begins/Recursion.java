import java.util.*;

public class Recursion {

    public static void printDec(int n) {

        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);

    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fact = n * fnm1;

        return fact;
    }

    public static int sumOfNaturalNums(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = 0;
        int snm1 = sumOfNaturalNums(n - 1);
        sum = n + snm1;
        return sum;

    }

    public static int fibnoacciSeries(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fibnm1 = fibnoacciSeries(n - 1);
        int fibnm2 = fibnoacciSeries(n - 2);
        int fib = fibnm1 + fibnm2;
        return fib;
    }

    public static boolean isSorted(int array[], int i) {

        if (i == array.length - 1) {
            return true;
        }

        if (array[i] > array[i + 1]) {
            return false;
        }

        return isSorted(array, i + 1);
    }

    public static int firstOccurence(int array[], int key, int i) {

        if (i == array.length) {
            return -1;
        }
        if (array[i] == key) {
            return i;
        }

        return firstOccurence(array, key, i + 1);
    }

    public static int lastOccurence(int array[], int key, int i) {

        if (i == array.length) {
            return -1;
        }
        int isFound = lastOccurence(array, key, i + 1);
        if (isFound == -1 && array[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int poWer(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1 = poWer(x, n - 1);
        // int xn = x * xnm1;
        return x * poWer(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2) * optimizedPower(x, n / 2);
        // n is Odd
        if (n % 2 != 0) {
            halfPower = x * halfPower;
        }
        return halfPower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // printDec(n);
        // printInc(n);
        // System.out.println(factorial(n));
        // System.out.println(sumOfNaturalNums(n));
        // System.out.println(fibnoacciSeries(n));
        int array[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        // System.out.println(isSorted(array, 0));
        // System.out.println(firstOccurence(array, 10, 0));
        // System.out.println(lastOccurence(array, 5, 0));
        // System.out.println(poWer(2, 10));
        System.out.println(optimizedPower(2, 10));
    }
}
