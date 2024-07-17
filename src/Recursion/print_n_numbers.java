package Recursion;

public class print_n_numbers {
    public static void main(String args[]){
        int n=5;
        printinc(n);
    }/*
    public static void printinc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }*/
    public static void printinc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printinc(n-1);

    }
}
