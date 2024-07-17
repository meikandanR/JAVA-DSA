package Dynamic_prgm;

public class FiboTD {
    static int fibotd(int N,int[]arr){


        if(arr[N]!=0){
            return arr[N];
        }
        if(N ==0||N==1){
            arr[N]=N;
            return N;
        }
        int last = fibotd(N-1,arr);
        int slast = fibotd(N-2,arr);
        int fn=last+slast;
        arr[N]=fn;
        return fn;


    }
    public static void main(String[] args) {


        int N = 10000;
        int arr[]=new int[N+1];
        System.out.println(fibotd(N,arr));
    }


}
