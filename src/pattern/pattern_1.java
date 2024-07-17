package pattern;

import java.util.Scanner;

public class pattern_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int sp=2*(n-1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            for (int j = 0; j <sp; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
            sp-=2;
        }
    }
    }

