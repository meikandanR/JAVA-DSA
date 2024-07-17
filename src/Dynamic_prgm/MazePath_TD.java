package Dynamic_prgm;

public class MazePath_TD {

        public static int path(int n, int row, int col, String ans, int[][]grid){

            if(row==n && col==n){

                System.out.println(ans);
                return 1;

            }
            if(grid[row][col]!=0){
                return grid[row][col];
            }
            if(row >n||col>n){
                return 0;
            }
            int num1=path(n,row,col+1,ans+"H",grid);
            int num2=path(n,row+1,col,ans+"V",grid);
            grid[row][col]=num1+num2;



            //  path(n,row+1,col+1,ans+"R");

            return 0;

        }
        public static void main(String args[]){
            int[][]grid=new int[2][2];
            path(2,0,0,"",grid);


        }
    }


