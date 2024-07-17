package hashtable;
import java.util.*;
import java.util.Scanner;

public class Basic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        int q=sc.nextInt();
        while(q-->0){
            char ch;
            ch=sc.next().charAt(0);
            System.out.println(hash[ch-'a']);
        }
    }
}
