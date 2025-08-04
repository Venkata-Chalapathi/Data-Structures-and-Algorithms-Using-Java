import java.util.*;

public class Functions {

    // public static void printHelloWorldFunc() {
    // System.out.println("Hello World");
    // return;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // printHelloWorldFunc();
    // }

    // public static int sumFunc(int a, int b) {
    // int sum;
    // sum = a + b;
    // return sum;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a,b values :");
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int result = sumFunc(a, b);
    // System.out.println("Sum of 2 nums :" + result);
    // }

    // public static int findFactorial(int num) {

    // int fact = 1, i;
    // for (i = num; i >= 1; i--) {
    // fact = fact * i;
    // }
    // return fact;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter n value :");
    // int n = sc.nextInt();
    // int result = findFactorial(n);
    // System.out.println("Factoral of a number :" + result);
    // }

    // public static int findFactorial(int num) {

    // int fact = 1, i;
    // for (i = num; i >= 1; i--) {
    // fact = fact * i;
    // }
    // return fact;
    // }

    // public static int binomialCoeff(int n, int r) {
    // int n_fact = findFactorial(n);
    // int r_fact = findFactorial(r);
    // int nmr_fact = findFactorial(n - r);

    // int bincoeff = n_fact / (r_fact * nmr_fact);

    // return bincoeff;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter n value :");
    // int n = sc.nextInt();
    // System.out.println("Enter r value :");
    // int r = sc.nextInt();
    // int result = binomialCoeff(n, r);
    // System.out.println("Bionmial Coefficient of a number :" + result);
    // }

    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println(sum(5, 3));
    // System.out.println(sum(5, 2, 1));
    // }

    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // public static float sum(float a, float b) {
    // return a + b;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println(sum(5, 3));
    // System.out.println(sum(3.2f, 4.8f));
    // }

    // public static boolean primeOrNot(int n) {
    // boolean isPrime = true;
    // int i;
    // if (n == 2) {
    // return true;
    // } else {
    // for (i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // return isPrime;
    // }
    // }

    // public static void primeinRange(int n) {
    // int i;
    // for (i = 2; i <= n; i++) {
    // if (primeOrNot(i)) {
    // System.out.print(i + " ");
    // }
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number to check prime or not and range :");
    // int num = sc.nextInt();

    // primeinRange(num);
    // // boolean result = primeOrNot(num);
    // // if (result == true) {
    // // System.out.println("Prime Number....");
    // // } else {
    // // System.out.println("Not a prime....");
    // // }
    // }

    // public static int binToDec(int binNum) {
    // int pow = 0;
    // int decimal = 0;

    // while (binNum > 0) {
    // int lastDigit = binNum % 10;
    // decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
    // pow++;
    // binNum = binNum / 10;
    // }
    // return decimal;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter Binary Number to convert :");
    // int binNum = sc.nextInt();
    // int result = binToDec(binNum);
    // System.out.println("Decimal Number :" + result);
    // }

    public static int decToBin(int decNum) {
        int pow = 0;
        int binary = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number to convert :");
        int decNum = sc.nextInt();
        int result = decToBin(decNum);
        System.out.println("Binary Number :" + result);
    }
}