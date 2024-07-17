package pattern;

import java.util.Scanner;

public class pattern_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){

        for (int i = 1; i <=n ; i++) {

            for (char ch = 'A'; ch<='A'+(n-i); ch++) {
                System.out.print(ch+" ");

            }
            System.out.println();

        }
    }
}
