package Dynamic_prgm;

public class fiboBU {
    public static void main(String[] args) {

        int N = 10000;
        int arr[]=new int[N+1];
        System.out.println(fiboBU(N));
    }
    public static int fiboBU(int n){
        int[]strg=new int[n+1];
        strg[0]=0;
        strg[1]=1;
        for(int i=2;i<=n;i++){
            strg[i]=strg[i-1]+strg[i-2];
        }
        return strg[n];
    }


}
