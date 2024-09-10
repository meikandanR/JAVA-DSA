package Company_ques;
import java.util.*;
public class ProductSmallestPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int nums[]={5,2,3,9,7,1};
        System.out.println(productSum(sum,nums));
    }
    public static int productSum(int sum,int[] arr){
        int i=0;
        int j=1;
        int least=Integer.MAX_VALUE;
        while(i<arr.length-1 && j<arr.length){
            if(arr[i]+arr[j]<=sum){
                if((arr[i]+arr[j])<least){
                    least=arr[i]+arr[j];
                }
            }

                i++;
                j++;

        }
        return least;
    }
}
