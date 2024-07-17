package Tree;

public class count_OF_Node {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
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
        root.right.right.left=new Node(8);
        int ans=Count(root);
        System.out.println(ans);
    }
    static int count=0;
    public static int Count(Node root){

        if(root==null){
            return -1;
        }
        count++;
        Count(root.left);
        Count(root.right);

        return count;
    }
}
