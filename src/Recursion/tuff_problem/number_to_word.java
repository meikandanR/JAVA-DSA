package Recursion.tuff_problem;

public class number_to_word {
    static String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args) {
        int num=219;

        int i=0;
        wordname(num);
    }
    public static void wordname(int num){
        if(num==0){
            return;
        }
        int last_item=num%10;
        wordname(num/10);
        System.out.print(str[last_item]+" ");

    }

}
