package leetcode;

import java.util.HashSet;
import java.util.Stack;

public class happy_number {
    public static void main(String[] args) {
        int n=19;
        System.out.println(ishappy(n));

    }
    public static boolean ishappy(int n){
        HashSet<Integer>hs=new HashSet<>();
        while(n!=1 && !(hs.contains(n))){
            hs.add(n);
            n=Next(n);

        }
        if(n==1){
            return true;
        }
        return false;
    }
    public static int Next(int n){
        int tot=0;
        while(n>0){
            int rem=n%10;
            tot+=rem*rem;
            n/=10;

        }
        return tot;

    }


}
