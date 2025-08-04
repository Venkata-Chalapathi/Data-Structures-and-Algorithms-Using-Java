
public class pracLinkedList {

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
    public static int size;

    public void addFirst(int data) {

        // step 1 = Create Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 = update next val
        newNode.next = head;

        // Step 3 = change head
        head = newNode;
    }

    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkedList() {

        if (head == null) {
            System.out.print("Ll is Empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {

        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {

        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        // prev = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int searchKey(int key) {

        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // Not found case
        return -1;
    }

    public void reverseList() {

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthNode(int n) {

        // Calculate size

        int size = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next; // Delete HEad
        }

        int i = 1;
        int tToFind = size - n;

        Node prev = head;
        while (i < tToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMidNode(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean checkPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        // step 1 : Find Mid
        Node midNode = findMidNode(head);

        // Step 2: Reverse Right Half

        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Step 3: Check Left and Right Nodes
        Node right = prev; // Right Half Head
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean isCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {

        // step1 : check cycle exist or not

        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // step 2: Find meeting point

        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // step3 : Make last node as null
        prev.next = null;
    }

    public Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public Node merge(Node head1, Node head2) {

        Node newNode = new Node(-1);
        Node temp = newNode;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return newNode.next;
    }

    public Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        // Find mid

        Node midNode = getMid(head);

        // Find left & right msort

        Node rightNode = midNode.next;
        midNode.next = null;

        Node newLeftLL = mergeSort(head);
        Node newRightLL = mergeSort(rightNode);

        // merge Sort

        return merge(newLeftLL, newRightLL);
    }

    public void zigZag() {

        // FInd Mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node midNode = slow;

        // 2nd Half Reverse

        Node curr = midNode.next;
        midNode.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Alternate Merge

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        // pracLinkedList ll = new pracLinkedList();
        // ll.printLinkedList();
        // ll.addFirst(1);
        // // ll.printLinkedList();
        // ll.addFirst(2);
        // // ll.printLinkedList();
        // ll.addLast(1);
        // // ll.printLinkedList();
        // ll.addLast(2);
        // // ll.printLinkedList();
        // ll.addMiddle(2, 8);
        // ll.printLinkedList();
        // System.out.println(ll.size);
        // System.out.println(ll.removeFirst());

        // ll.printLinkedList();
        // System.out.println(ll.size);
        // System.out.println(ll.removeLast());
        // ll.printLinkedList();
        // // System.out.println(ll.size);
        // System.out.println(ll.searchKey(8));
        // System.out.println(ll.searchKey(89));
        // ll.reverseList();
        // ll.printLinkedList();
        // ll.deleteNthNode(3);
        // ll.printLinkedList();
        // System.out.println(ll.checkPalindrome());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        pracLinkedList ll = new pracLinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        // ll.printLinkedList();
        // ll.head = ll.mergeSort(ll.head);
        // ll.printLinkedList();

        ll.printLinkedList();
        ll.zigZag();
        ll.printLinkedList();

    }
}