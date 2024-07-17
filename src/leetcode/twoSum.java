
package leetcode;

/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]*/
import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] arr = twosum(nums, target);
        System.out.println(arr.toString());
    }

    public static int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; i < nums.length; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};

    }
}

