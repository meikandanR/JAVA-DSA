package Queue.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_Basics {
    public static void main(String[] args) {
        
        Deque<Integer>d=new LinkedList<>();
        d.addFirst(1);
        d.addLast(2);
        d.addFirst(23);
        d.addFirst(29);
        d.addLast(20);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);

        System.out.println(d.reversed());
    }
}
