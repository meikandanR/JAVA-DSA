package pattern;

import java.util.Scanner;

public class pattern_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){

        for (int i = 0; i <n ; i++) {

            for(char ch=(char)(int)('A'+n-i-1);ch<=(char)(int)('A'+n-1);ch++){
                System.out.print(ch);
            }
            System.out.println();

        }
    }
}
