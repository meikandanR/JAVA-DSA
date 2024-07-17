package zoho;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
//brute force
public class Multiple_index_exclude {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[]reslut=findMultiple(nums);
        System.out.println(Arrays.toString(reslut));
    }
    /*public static int[] findMultiple(int[]nums){
        int[]res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int mul=1;
            for (int j=0;j<nums.length;j++){
                if(i!=j) {
                    mul = mul * nums[j];
                }
            }
            res[i]=mul;
        }
        return res;
    }*/
    public static int[]findMultiple(int[] nums){
        int n=nums.length;
        int []res=new int[n];
        int []left=new int[n];
        int []right=new int[n];
        left[0]=1;
        right[n-1]=1;//right[3]
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<res.length;i++){
            res[i]=right[i]*left[i];
        }
        return res;
    }
}
