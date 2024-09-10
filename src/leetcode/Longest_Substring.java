package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class Longest_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0;
        int r=0;
        int len=Integer.MIN_VALUE;
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        while(r<n){
            if(map.containsKey(s.charAt(r))){
                l=Math.max(map.get(s.charAt(r))+1,l);
            }
            map.put(s.charAt(r),r);
            len=Math.max(len,r-l+1);
            r++;
        }
        System.out.println(len);
    }
}
