
public class LLPracMe {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // Create Node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // update next Val
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("LL is EMpty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LLPracMe ll = new LLPracMe();
        ll.printLinkedList();
        ll.addFirst(9);
        ll.printLinkedList();
        ll.addFirst(8);
        ll.printLinkedList();
        ll.addLast(10);
        ll.printLinkedList();
        ll.addLast(11);
        ll.printLinkedList();
    }
}
