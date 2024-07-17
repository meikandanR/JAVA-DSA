package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class first_char_unique {
    public static void main(String[] args) {
        String str="aabccxab";
        first_char_non_repeating(str);
    }
    public static void first_char_non_repeating(String str){
        Queue<Character>q=new LinkedList<>();
        int[] frq=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            frq[ch-'a']++;
        }
        while(!q.isEmpty() && frq[q.peek()-'a']>1){
            q.remove();
        }
        if(q.isEmpty()){
            System.out.println("-1");
        }
        else{
            System.out.println(q.peek());
        }
    }
}
