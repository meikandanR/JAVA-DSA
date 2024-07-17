package pattern;
import java.util.*;
public class patter_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=i*2-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
