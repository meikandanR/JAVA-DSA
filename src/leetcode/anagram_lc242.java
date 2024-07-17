package leetcode;

import java.util.Arrays;

public class anagram_lc242 {
    public static void main(String[] args) {
        String str1="rat";
        String str2="tab";
        System.out.println(isanagram(str1,str2));
    }
    public static boolean isanagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char []ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i< ch1.length;i++){
            for(int j=i;j<i+1;j++){
                if(ch1[i]!=ch2[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
