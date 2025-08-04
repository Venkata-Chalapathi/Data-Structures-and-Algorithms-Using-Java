import java.util.*;

public class BTHeightOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int heightTree(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = heightTree(root.left);
        int rh = heightTree(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int countNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int lcount = countNodes(root.left);
        int rcount = countNodes(root.right);

        return lcount + rcount + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = sumOfNodes(root.left);
        int rightCount = sumOfNodes(root.right);

        return leftCount + rightCount + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(heightTree(root));
        System.out.println(countNodes(root));
        System.out.println(sumOfNodes(root));
    }
}
