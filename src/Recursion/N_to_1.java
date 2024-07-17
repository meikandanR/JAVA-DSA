package Recursion;

import java.util.Scanner;

public class N_to_1 {
    public static void main(String args[]){
        N_to_1 sol=new N_to_1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= sc.nextInt();
        //sol.print(1,n);
        sol.print(n);
    }
    public void  print(int n){
        System.out.println(n);
        if(n==1){
            return;
        }
        print(n-1);

    }
}
