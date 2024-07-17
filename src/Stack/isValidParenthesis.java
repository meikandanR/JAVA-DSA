package Stack;

import java.util.Stack;

public class isValidParenthesis {
    public static void main(String args[]){
        String s="((()))(){}";
        boolean ans=isValid(s);
        System.out.println(ans);
    }
    public static boolean isValid(String s){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'||ch=='{'||ch=='('){
                stack.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                char top=stack.peek();
                if((top=='(' && ch==')') || (top=='{' && ch=='}') || (top=='[' && ch==']')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
