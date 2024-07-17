package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class flood_fill {
    public static void main(String[] args) {
        int[][]image={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;
        int sc=1;
        int clr=2;
        int[][]res=floodFill(image,sr,sc,clr);
        for(int i=0;i< res.length;i++){
            for(int j=0;j<res.length;j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] floodFill(int[][]img,int sr,int sc,int clr){
        int n= img.length;
        int m=img[0].length;

        img[sr][sc]=clr;
        Queue<Island.Pair> q=new LinkedList<>();
        q.add(new Island.Pair(sr,sc));

        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            q.remove();
            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol >= 0 && ncol < m  && img[nrow][ncol] == 1) {

                    img[nrow][ncol] = 2;
                    q.add(new Island.Pair(nrow,ncol));

                }


            }


        }
        return img;

    }
}
