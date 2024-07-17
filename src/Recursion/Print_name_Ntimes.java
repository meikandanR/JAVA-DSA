package Recursion;

import java.util.Scanner;

public class Print_name_Ntimes {
    public static void main(String args[]){
        Print_name_Ntimes sol=new Print_name_Ntimes();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        sol.printname(name,n);
    }
    public void printname(String name,int n){
        System.out.println(name);
        n=n-1;
        if(n==0){
            return ;
        }
        printname(name,n);
    }
}
