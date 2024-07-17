package Tree;

public class Same_tree_checking {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);

        Node root2=new Node(1);
        root2.left=new Node(2);
        root2.right=new Node(3);

        boolean ans=check(root1,root2);
        System.out.println(ans);
    }
    public static boolean check(Node n1,Node n2){

        if(n1==null && n2==null){
            return true;
        }
        if(n1==null||n2==null){
            return false;
        }
        if(n1.data!=n2.data){
            return false;
        }
        return check(n1.left,n2.left) && check(n1.right,n2.right);

    }

    }

