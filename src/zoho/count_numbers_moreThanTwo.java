package zoho;

import java.util.HashMap;
import java.util.Map;

public class count_numbers_moreThanTwo {
    public static void main(String[] args) {
        int[]nums={1,1,2,7,9,5,7,2,7};
        int result=countNumber(nums);
        System.out.println(result);
    }
    public static int countNumber(int[]nums){
        Map<Integer,Integer>box=new HashMap<>();

        int n=nums.length;
        if(n==0){
            return -1;
        }
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(box.containsKey(nums[i])) {
                box.put(nums[i], box.get(nums[i])+1);
            }else {
                box.put(nums[i], 1);
            }
        }
        for(int num: box.values()) {
            if (num> 1){
                count = count + 1;
            }
        }



        return count;


    }
}
