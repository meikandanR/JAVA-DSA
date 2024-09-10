package leetcode;
import java.util.*;
public class Longest_Palindrom_Substring_3 {
        public static String longestPalindrome(String s) {
            ArrayList<String>arr=new ArrayList<>();
            int i=0;
            int j=s.length();
            while(i<j){
                String s1=s.substring(i,j);
                if(ispalindrom(s1)){
                    arr.add(s1);
                }
                i++;
                j--;
            }
            for(int m=0;m<s.length();m++){
                String s2=s.substring(m);
                if(ispalindrom(s2)){
                    arr.add(s2);
                }
            }

            for(int m=s.length()-1;m>=0;m--){
                String s2=s.substring(0,m);
                if(ispalindrom(s2)){
                    arr.add(s2);
                }
            }
            System.out.print(arr);
            if(arr.size()==0){
                return "[]";
            }
            //for(int k=0;i<arr.size();i++){

            //}
            else{
                int maxLength=arr.get(0).length();
                String ans=arr.get(0);
                for(int l=1;i<arr.size();i++){
                    if(maxLength<arr.get(l).length()){
                        maxLength=arr.get(l).length();
                        ans=arr.get(l);
                    }
                }
                return ans;
            }


        }
        public static boolean ispalindrom(String s1){
            if(s1.equals("")){
                return false;
            }
            String s2="";
            for(int i=s1.length()-1;i>=0;i--){
                s2+=s1.charAt(i);
            }
            if(s1.equals(s2)){
                return true;
            }
            return false;
        }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ccd"));
    }
    }

