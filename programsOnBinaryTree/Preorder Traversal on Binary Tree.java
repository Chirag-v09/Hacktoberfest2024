// In this program we will perform Preorder traversal on a binary tree

import java.util.Scanner;

class Node {
    int val;
    Node left, right;

    Node(int data) {
        val = data;
        left = null;
        right = null;
    }
}

public class BinaryTree {

    static Node buildTree(Scanner sc) {
        System.out.print("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) return null;

        Node root = new Node(data);

        System.out.println("Enter data in left of " + data);
        root.left = buildTree(sc);

        System.out.println("Enter data in right of " + data);
        root.right = buildTree(sc);

        return root;
    }

    static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;

        root = buildTree(sc);

        System.out.print("Preorder Traversal: ");
        preorder(root);
    }
}
