package Tree;
import java.util.Scanner;
public class Getting_Input_data {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter root node value: ");
            int rootValue = sc.nextInt();

            Node root = new Node(rootValue);
            buildTree(root, sc);
        }
        // ...

    public static void buildTree(Node node, Scanner sc) {
        System.out.print("Enter left child of " + node.data + " (or -1 for null): ");
        int leftValue = sc.nextInt();
        if (leftValue != -1) {
            node.left = new Node(leftValue);
            buildTree(node.left, sc);
        }

        System.out.print("Enter right child of " + node.data + " (or -1 for null): ");
        int rightValue = sc.nextInt();
        if (rightValue != -1) {
            node.right = new Node(rightValue);
            buildTree(node.right, sc);
        }
    }

}
