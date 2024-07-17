package implement_LinkedList;

import java.util.Stack;

public class ResverseLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node reverseLinkedList(Node head) {
        Node temp = head;
        Stack<Integer>stack=new Stack<>();
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=stack.pop();
            temp=temp.next;
        }
        return head;
    }
    public static void printLinkList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        Node head=new Node(1);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);
        Node ans=reverseLinkedList(head);
        System.out.println("linkedList before reversing ");
        printLinkList(head);
        System.out.println();
        System.out.println("Linkedlist after revresing ");
        printLinkList(ans);
    }

}
