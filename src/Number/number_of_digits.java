package Number;

import java.util.Scanner;

public class number_of_digits {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        count_number(n);
    }
    static void count_number(int n){
        int cnt=(int)(Math.log10(n)+1);
//        while(n>0){
//            cnt+=1;
//            n=n/10;
//        }
        System.out.print(cnt);
    }
}
