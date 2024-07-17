package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        levelOrder(root);
    }
    static Queue<Node>resNode=new LinkedList<>();

    public static void levelOrder(Node root){
        Node temp=root;
        if(temp==null){
            return;
        }
        System.out.print(temp.data+" ");
        resNode.offer(root);
        if(temp.left!=null){
            resNode.offer(temp.left);

        }
        if(temp.right!=null){
            resNode.offer(temp.right);
        }
        resNode.poll();
        levelOrder(resNode.poll());

    }
}
