package Stack;

import javax.swing.*;
import java.util.Stack;

public class expresionPrblm {
    public static int operate(String[]tokens){
        Stack<Integer>st=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")) {
                int num1 = st.pop();
                int num2 = st.pop();
                int newnum = 0;
                switch (token) {
                    case "+":
                        newnum = num2 + num1;
                        break;
                    case "-":
                        newnum = num2 - num1;

                    case "*":
                        newnum = num2 * num1;
                        break;
                    case "/":
                        newnum = num2 / num1;
                        break;
                }
                st.push(newnum);
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String[]str={"2","1","+","3","*"};
        int res=operate(str);
        System.out.println(res);
    }
}
