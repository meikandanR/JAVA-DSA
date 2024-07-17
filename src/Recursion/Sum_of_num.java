package Recursion;

import java.util.Scanner;

public class Sum_of_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sum(n);
        System.out.println(s);
    }
    public static int sum(int n) {
            if(n==0){
                return 1;
            }
            return n*sum(n-1);


        }
}
