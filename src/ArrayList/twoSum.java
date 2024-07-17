package ArrayList;

import java.util.ArrayList;

public class twoSum {
        public static void twoSum(int[] nums, int target) {
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;i<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        arr.add(i);
                        arr.add(j);
                    }
                }
            }
            System.out.println(arr);
        }

    public static void main(String[] args) {
        int[]nums={2,7,11,15};
        int target=9;
        twoSum(nums,target);
    }

}

