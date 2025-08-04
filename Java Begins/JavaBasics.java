import java.util.*;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Your Name");
        // String input = sc.nextLine();

        // System.out.println(input);

        // boolean bool = sc.nextBoolean();
        // System.out.println(bool);

        // System.out.println("Enter A&B Values to add :");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // int prod = a * b;
        // System.out.println("Sum = " + sum);
        // System.out.println(prod);

        // System.out.println("Enter a value :");
        // int a = sc.nextInt();
        // System.out.println("Enter b value :");
        // int b = sc.nextInt();
        // System.out.println("Enter Operator :");
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        // case '+':
        // System.out.println(a + b);
        // break;
        // case '-':
        // System.out.println(a - b);
        // break;
        // case '*':
        // System.out.println(a * b);
        // break;
        // case '/':
        // System.out.println(a / b);
        // break;
        // case '%':
        // System.out.println(a % b);
        // break;
        // default:
        // System.out.println("Enter correct Operator");
        // }

        // int i = 1;
        // int n = 5;
        // int sum = 0;
        // while (i <= n) {
        // // System.out.println(i);
        // sum = sum + i;
        // i++;
        // }
        // System.out.println(sum);

        // for (i = 1; i <= n; i++) {
        // System.out.println(i);
        // }
        // int i, j, n = 5;
        // for (i = 0; i < n; i++) {
        // for (j = 0; j < n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 1234;
        // int rem, reverse = 0;
        // while (n > 0) {
        // rem = n % 10;
        // // System.out.print(rem + " ");
        // reverse = reverse * 10 + rem;
        // n = n / 10;
        // }
        // System.out.println(reverse);

        // int n;

        // do {
        // System.out.println("Enter number :");
        // n = sc.nextInt();
        // // System.out.println(n);
        // } while (n % 10 != 0);

        int n;

        do {
            System.out.println("Enter number :");
            n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}