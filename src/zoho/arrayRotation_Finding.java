package zoho;

import java.util.Arrays;
import java.util.*;
public class arrayRotation_Finding {
    public static void main(String[] args) {
        int[] num={3,4,5,6,7,8,0,1,2};
        int result=findmin(num);
        System.out.println(result);
        int res=findRotation(num);
        System.out.println(res);
    }
    public static int findmin(int[] num) {
        int min=num[0];

        for(int i=1;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }

        return min;
    }
    public static int findRotation(int []num){
        int minIdx=0;

        for(int i=1;i< num.length;i++){
            if(num[i]<num[minIdx])
            {
                minIdx=i;
            }
        }
        return minIdx;
    }
}
