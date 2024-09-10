package leetcode;

import java.util.Scanner;

public class Integer_to_Word {
    static String []belowTwenty= {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"};
    static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print(helper(n));

    }
    public static String helper(int n){
        StringBuilder str=new StringBuilder();
        if(n==0){
            return "Zero";
        }
        else if(n<20)
            str.append(belowTwenty[n]);
        else if (n<100)
            str.append(tens[n/10]).append(" ").append(belowTwenty[n%10]);
        else if(n<1000)
            str.append(helper(n/100)).append(" hundred ").append(helper(n%100));
        else
            str.append(helper(n/1000)).append(" thousand ").append(helper(n%1000));
        return str.toString().trim();
    }
}
