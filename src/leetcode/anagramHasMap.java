package leetcode;

import java.util.HashMap;

public class anagramHasMap {
    public static void main(String[] args) {
        String s="aacc";
        String t="ccac";
        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s,String t){
        HashMap<Character,Boolean>hs=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(!hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i),true);
            }
            else{
                if(hs.get(s.charAt(i))==true){
                    hs.put(s.charAt(i),false);
                }
                else{
                    hs.put(s.charAt(i),true);
                }
            }

        }
        for(int i=0;i<t.length();i++){
            if(hs.containsKey(t.charAt(i))){
                if(hs.get(t.charAt(i))==true){
                    hs.put(t.charAt(i),false);
                }
                else{
                    hs.put(t.charAt(i),true);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
