package Stack;

import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        String s="hello";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
