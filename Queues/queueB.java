import java.util.*;

public class queueB {

    // static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // public static class Queue {

    // // static int arr[];
    // // static int size;
    // // static int rear;
    // // static int front = 0;

    // // Queue(int n) {
    // // arr = new int[n];
    // // size = n;
    // // rear = -1;
    // // front = -1;
    // // }

    // static Node head = null;
    // static Node tail = null;

    // public static boolean isEmpty() {
    // // return rear == -1 && front == -1;
    // return head == null && tail == null;
    // }

    // // public static boolean isFull() {
    // // return (rear + 1) % size == front;
    // // }

    // public static void add(int data) {
    // Node newNode = new Node(data);
    // if (head == null) {
    // head = tail = newNode;
    // return;
    // }

    // tail.next = newNode;
    // tail = newNode;
    // }

    // public static int remoVe() {
    // if (isEmpty()) {
    // System.out.println("Empty Queue");
    // return -1;
    // }
    // // int res = arr[front];

    // // // last elem del
    // // if (front == rear) {
    // // front = rear = -1;
    // // } else {
    // // front = (front + 1) % size;
    // // }

    // // return res;

    // int front = head.data;
    // if (head == tail) {
    // head = tail = null;
    // } else {
    // head = head.next;
    // }

    // return front;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("Empty Queue");
    // return -1;
    // }

    // // return arr[front];
    // return head.data;
    // }
    // }

    public static void main(String[] args) {

        // Queue q = new Queue();

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}