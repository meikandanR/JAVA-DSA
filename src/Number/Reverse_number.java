package Number;
import java.util.*;

import static java.util.Collections.reverse;

public class Reverse_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=rev(n);
        System.out.println(ans);
    }
    static int rev(int n){
        int re=0;
        while(n>0){
            int R=n%10;
            re=(re*10)+R;
            n/=10;
        }
        return re;
    }
}
