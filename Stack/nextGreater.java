import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {

        int arr[] = { 6, 8, 0, 1, 3 };

        Stack<Integer> s = new Stack<>();
        int nextGreaters[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // if else
            if (s.isEmpty()) {
                nextGreaters[i] = -1;
            } else {
                nextGreaters[i] = arr[s.peek()];
            }

            // push in s
            s.push(i);
        }

        for (int i = 0; i < nextGreaters.length; i++) {
            System.out.print(nextGreaters[i] + " ");
        }
    }
}
