package Recursion.tuff_problem;

public class sum_of_target {
    public static void main(String[] args) {
        int arr[]={10,20,30,5,25};
        int i=0;
        String ans="";
        int target=30;
        int sum=0;
        target_check(arr,i,ans,sum,target);
    }
    public static void target_check(int arr[],int i,String ans,int sum,int target){
        if(i==arr.length){
            if(target==sum){
                System.out.println(ans+" ");
            }
            return;
        }
        if (target == sum) {

            System.out.println(ans+" ");
        }
        if(sum>target){
            return;
        }
        
        target_check(arr,i+1,ans+arr[i],sum+arr[i],target);
        target_check(arr,i+1,ans,sum,target);
    }
}
