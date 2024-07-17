package Recursion.tuff_problem;

public class QueenCombination {
    public static void queenCombination(boolean[] box,int col,int qpsf,int tq,String ans){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        if(col==box.length){
            return;
        }
        if(box[col]==false){
            box[col]=true;
            queenCombination(box,col+1,qpsf+1,tq,ans+"B"+col);
            box[col]=false;
            queenCombination(box,col+1,qpsf,tq,ans);
        }
    }


    public static void main(String[] args) {
        queenCombination(new boolean[4],0,0,2,"");
    }
}
