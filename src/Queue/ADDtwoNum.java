package Queue;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ADDtwoNum {
    public static class Node {
        int val;
        Node next;

        Node(int item) {
            this.val = item;
            this.next = null;
        }
    }
        public static Node add_TwoLinked_List(Node l1,Node l2){
            if(l1.val==0 && l2.val==0){
                return new Node(0);
            }
            Node temp1=l1;
            Node temp2=l2;
            Stack<Integer>stack1=new Stack<>();
            Stack<Integer>stack2=new Stack<>();
            while(temp1!=null){
                stack1.push(temp1.val);
                temp1=temp1.next;
            }
            while(temp2!=null) {
                stack2.push(temp2.val);
                temp2 = temp2.next;
            }
            int sum1=0;
            while(!stack1.isEmpty()){
                sum1=sum1*10+stack1.pop();
            }
            int sum2=0;
            while(!stack2.isEmpty()){
                sum2=sum2*10+stack2.pop();
            }
            int res=sum1+sum2;
            Queue<Integer>queue=new LinkedList<>();
            while(res!=0){
                int rem=res%10;
                queue.add(rem);
                res=res/10;
            }
            Node dummy=new Node(0);
            Node curr=dummy;
            while(!queue.isEmpty()) {
                curr.next = new Node(queue.poll());
                curr = curr.next;
            }
            return dummy.next;
    }

    public static void PrinLinked(Node ans){
        while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }
    }



    public static void main(String[] args) {
        Node head1=new Node(2);
        head1.next=new Node(4);
        head1.next.next=new Node(3);

        Node head2=new Node(5);
        head2.next=new Node(6);
        head2.next.next=new Node(4);
        Node ans=add_TwoLinked_List(head1,head2);
        PrinLinked(ans);

    }
    }

