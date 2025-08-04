import java.util.*;

public class BTDiameterOfTree {

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

    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiam = diameterOfTree(root.left);
        int rightDiam = diameterOfTree(root.right);
        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);
        int selfDiam = leftHeight + rightHeight + 1;

        return Math.max(Math.max(rightDiam, leftDiam), selfDiam);

    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameterOfTree(root));
    }
}
