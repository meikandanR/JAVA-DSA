package Recursion;
import java.util.*;
public class rev_recursive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String []s=sc.nextLine().split(",");
        int [] arr=new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        int start=0;
        int end=s.length-1;
        rev(arr,start,end);
        print(arr);
    }
    static void rev(int[] arr,int start,int end){
        if(start<end){
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            rev(arr,start+1,end-1);
        }

    }
    static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
