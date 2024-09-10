package String;

import java.util.Scanner;

public class PrimeCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        s=s.toLowerCase();
        int []ch=new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
        }
        for(int i=0;i<ch.length;i++){
            if(checkprime(ch[i])&& ch[i]>0){
                ans+=(char)(i-'a');
            }
        }
        System.out.println(ans);
    }
    public static boolean checkprime(int num){
        if(num<=1){
            return false;
        }
        else{
            for(int i=2;i<Math.sqrt(num);i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
