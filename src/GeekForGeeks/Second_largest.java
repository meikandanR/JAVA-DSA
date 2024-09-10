package GeekForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Second_largest {
    public static int print2largest(List<Integer> arr) {
        int max=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        int seclarge=max;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=max){
                if(max-arr.get(i)<seclarge){
                    seclarge=arr.get(i);
                }
            }
        }
        return seclarge;
    }

    public static void main(String[] args) {
        List<Integer>arr= Arrays.asList(28004,23544,32504,29493,17013,17850,18952,12089,512,10353);
        System.out.println(print2largest(arr));
    }
}
