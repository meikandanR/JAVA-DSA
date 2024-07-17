package leetcode.leetcode;

import java.util.HashSet;

public class contains_duplicate2 {
    public static void main(String[] args) {
        int nums[]={1,2,3,1,2,3};
        int k=2;
        System.out.println(isContains(nums,k));
    }
    public static boolean isContains(int []nums,int k){
        HashSet hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=k){
                hs.add(nums[i]);
            }else{
                return false;
            }
        }
        return true;
    }
}
