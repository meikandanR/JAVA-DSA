package Graph;

public class Island_DFS {
    public static void main(String[] args) {
        int [][]grid={{0,0,0,0},{0,1,1,0},{0,0,0,0},{0,0,0,1},{0,0,0,0}};
        int ans=island(grid);
        System.out.println(ans);
    }
    public static int island(int[][]grid){
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==false) {
                    dfs(grid, i, j, vis,n,m);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void dfs(int[][]grid,int r,int c,boolean[][]vis,int n,int m){
        vis[r][c]=true;
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        for(int i=0;i<4;i++){
            int nrow=r+drow[i];
            int ncol=c+dcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol >= 0 && ncol < m && vis[nrow][ncol] == false && grid[nrow][ncol] == 1){
                dfs(grid,nrow,ncol,vis,n,m);
            }

        }
    }

}
