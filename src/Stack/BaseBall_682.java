package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BaseBall_682 {
    public static void main(String[] args) {
        String[] str={"5","2","C","D","+"};
        int res=callPoint(str);
        System.out.println(res);
    }
    public static int callPoint(String[]arr) {
        if(arr.length==0){
            return 0;
        }
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("C")){
                stack.pop();
            }
            else if(arr[i].equals("D")){
                int temp=stack.peek();
                stack.push(2*temp);
            }
            else if(arr[i].equals("+")){
                int temp1=stack.pop();
                int temp2=stack.peek();
                stack.push(temp1);
                stack.push(temp1+temp2);

            }
            else {
                stack.push(Integer.parseInt(arr[i]));
            }

        }
        System.out.println(stack);
        int sum=0;
        while(!stack.isEmpty()){
            sum=sum+stack.pop();
        }
        return sum;

    }
    }
