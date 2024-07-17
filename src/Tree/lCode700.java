package Tree;

public class lCode700 {
        public static class Node{
            int data;
            Node left;
            Node right;
            public Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        public static Node preorder(Node root,int val){
            if(root==null){
                return root;
            }
            if(root.data==val) {
                return root;
            }
            if(root.data>val) {
                return preorder(root.left, val);
            }
            else {
                return preorder(root.right, val);
            }

        }





        public static  void main(String[] args) {
            Node root=new Node(4);
            root.left=new Node(2);
            root.right=new Node(7);
            root.left.left=new Node(1);
            root.left.right=new Node(3);

            Node ans=preorder(root,2);
            while(ans!=null){
                System.out.print(ans.data);
            }

        }
    }








