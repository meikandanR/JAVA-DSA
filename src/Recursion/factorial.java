package Recursion;

public class factorial {
    public static void main(String arg[]){
        int n = 5;
        int num =printinc(n);
        System.out.println(num);
    }

    public static int printinc(int n){
        if(n==1){
            return 1;
        }
        return n * printinc(n - 1);

    }
}


