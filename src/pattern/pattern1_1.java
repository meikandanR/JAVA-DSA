package pattern;
import java.util.*;
public class pattern1_1 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        up(n);
        down(n);



    }
    static void up(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
    static void down(int n){
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
