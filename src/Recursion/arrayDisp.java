package Recursion;

import java.util.Scanner;

public class arrayDisp {
    public static void arrayDisplay(int[] arr,int i) {
        if (i == arr.length-1) {
            System.out.println(arr[i]);
            return;
        }
        System.out.println(arr[i]);
        arrayDisplay(arr, i + 1);

    }
    public static void main(String args[]){
        int [] arr={10,10,20,30,40};
        int i=0;
        arrayDisplay(arr,i);
    }

}
