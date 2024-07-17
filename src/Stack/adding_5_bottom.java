package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class adding_5_bottom {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        pushbottom();
        System.out.println(stack);

    }
    public static void pushbottom(){
        while(stack.isEmpty()){
            stack.push(5);
            return;
        }
        int temp=stack.pop();
        pushbottom();
        stack.push(temp);

    }
}
