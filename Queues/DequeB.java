import java.util.*;

public class DequeB {

    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();

        d.addFirst(1);
        d.addFirst(2);
        d.addLast(3);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        d.addFirst(5);
        d.addLast(10);
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
    }
}
