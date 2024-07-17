package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
public class Island {
    public static class Pair {
        int row;
        int col;


        Pair(int r, int c) {
            this.row = r;
            this.col = c;

        }
    }
    public static void main(String[] args) {
        int [][]grid={{0,1,1,0},{0,1,1,0},{0,0,1,0},{0,0,0,0},{1,1,0,1}};
        int ans=island(grid);
        System.out.println(ans);
    }

    public static int island(int[][]grid){
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int cnt=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++) {
                if (grid[row][col] == 1 && vis[row][col] == 0) {
                    bfs(row, col, grid, vis, n, m);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void bfs(int r,int c,int[][]grid,int[][]vis,int n,int m){
        vis[r][c]=1;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(r,c));

        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        while(!q.isEmpty()){

            int row = q.peek().row;
            int col = q.peek().col;
            q.remove();
            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {

                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow,ncol));

                }
            }

        }

    }

}
