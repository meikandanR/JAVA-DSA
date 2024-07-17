package Recursion.tuff_problem;

public class maze_path {
    static int cnt=0;
    public static int path(int n,int row,int col,String ans){

        if(row==n && col==n){

            System.out.println(ans);
            cnt++;

        }
        if(row >n||col>n){
            return 0;
        }
        path(n,row,col+1,ans+"H");
        path(n,row+1,col,ans+"V");
      //  path(n,row+1,col+1,ans+"R");

        return cnt;

    }
    public static void main(String args[]){
        int ans=path(2,0,0,"");
        System.out.println(ans);
    }
}
