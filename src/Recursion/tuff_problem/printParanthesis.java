package Recursion.tuff_problem;

public class printParanthesis {
    public static void main(String[] args) {
        generateParanthesis(3,0,0,"");

    }
    public static void generateParanthesis(int n,int open, int close, String ans){
        if(open==n && close==n){
            System.out.println(ans);
        }
        if(open>n||close>n){
            return;
        }
        generateParanthesis(n,open+1,close,ans+'(');
        if(close<open){
            generateParanthesis(n,open,close+1,ans+')');
        }

    }
}
