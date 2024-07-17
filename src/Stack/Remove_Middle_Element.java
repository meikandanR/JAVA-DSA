package Stack;

import java.util.Stack;

public class Remove_Middle_Element {
    static Stack<Integer> stack=new Stack<>();
    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Original stack"+stack);
        int size= stack.size();
        deletemiddle(size,0);
        System.out.println("stack after deleting middle element"+stack);
    }
    public static void deletemiddle(int size,int current){
        if(current ==size/2){
            stack.pop();
            return;
        }
        int topElement=stack.pop();
        deletemiddle(size,current+1);
        stack.push(topElement);
    }
}
