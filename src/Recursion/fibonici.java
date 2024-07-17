package Recursion;

import java.util.Scanner;

public class fibonici {


    static int fibonacci(int N,int[]arr){


        if(arr[N]!=0){
            return arr[N];
        }
        if(N ==0||N==1){
            arr[N]=N;
            return N;
        }
        int last = fibonacci(N-1,arr);
        int slast = fibonacci(N-2,arr);
        int fn=last+slast;
        arr[N]=fn;
        return fn;


    }
    public static void main(String[] args) {


        int N = 10000;
        int arr[]=new int[N+1];
        System.out.println(fibonacci(N,arr));
    }








//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter the number of terms: ");
//            int n = sc.nextInt();
//            System.out.print("Fibonacci Series: ");
//            fibo(0, 1, n);
//            sc.close();
//        }
//

//        static void fibo(int f, int s, int n) {
//            if (n > 0) {
//                System.out.print(f + " ");
//                fibo(s, f + s, n - 1);
//            }
//        }
    }


