package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_queue {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        for(int i=0;i<4;i++){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        System.out.println(queue);

        System.out.println(queue);
    }
}
