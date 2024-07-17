package implement_LinkedList;
import java.util.*;

import static java.util.Collections.sort;

public class sorting_LinkedList {

public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
   }
/*
        public static Node mergeSortedLists(Node h1, Node h2) {
            Node dummy = new Node(0);
            Node tail = dummy;

            while (h1 != null && h2 != null) {
                if (h1.data <= h2.data) {
                    tail.next = h1;
                    h1 = h1.next;
                } else {
                    tail.next = h2;
                    h2 = h2.next;
                }
                tail = tail.next;
            }


            if (h1 != null) {
                tail.next = h1;
            }
            if (h2 != null) {
                tail.next = h2;
            }

            return dummy.next;
        }
*/






        public static Node sorting(Node h1, Node h2) {
            List<Integer> arrlist = new ArrayList<>();
            while (h1 != null) {
                arrlist.add(h1.data);
                h1 = h1.next;
            }
            while (h2 != null) {
                arrlist.add(h2.data);
                h2 = h2.next;
            }
            sort(arrlist);
            Node dummy = new Node(0); // Dummy node to simplify list creation
            Node current = dummy;
            for (int value : arrlist) {
                current.next = new Node(value);
                current = current.next;
            }
            return dummy.next;


        }
        public static void main(String[] args) {
            Node h1 = new Node(1);
            h1.next = new Node(2);
            h1.next.next = new Node(4);

            Node h2=new Node(1);
            h2.next=new Node(3);
            h2.next.next=new Node(4);

            Node res=sorting(h1,h2);

        }
    }



