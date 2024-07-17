package implement_LinkedList.Reverse;

import implement_LinkedList.ResverseLinkedList;

import java.util.Stack;

public class LL_Palindrom {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean ispalindrom(Node head) {
        Stack<Integer> st= new Stack<>();
        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.data!=st.peek()){
                return false;
            }
            st.pop();
            temp=temp.next;
        }
        return true;

    }


    public static void main(String args[]) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(20);
        head.next.next.next=new Node(10);
        if (ispalindrom(head)) {

            System.out.println("yes");
        }
        else
            System.out.println("no");

    }
}
