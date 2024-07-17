package Recursion;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String args[]){
       // Scanner sc=new Scanner();
        int arr[]={2,1,4,5,6,8,9};
        int n=arr.length;
        reverse(arr,n);

    }
    static void reverse(int[]arr,int n){
        int []ans=new int[arr.length];
        for(int i=n-1;i>=0;i--){
            ans[n-i-1]=arr[i];
        }
        printArray(ans,n);
    }
    static void printArray(int ans[],int n){
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
