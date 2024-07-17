package Number;
import java.util.*;
import java.util.Scanner;

public class palindrom {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res =pal(n);
        if(res)
            System.out.println("YES PALINDROM");

        else
            System.out.println("NOT PALINDROM");
    }
    static boolean pal(int n){
        int num=n;
        int rev=0;
        while(n>0){
            int R=n%10;
            rev=(rev*10)+R;
            n/=10;
        }
        return rev==num;
    }

}
