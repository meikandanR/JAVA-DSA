package Graph;

public class Largest_Sum_Cycle {
        static  long largestsum=-1;
        static int count=0;
        public static void main(String[] args) {
            int N=23;
            boolean pathvisit[]=new boolean[N];
            boolean nodeVisit[]=new boolean[N];
            int[]edges={4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
            for(int i=0;i<edges.length;i++){
                if(!nodeVisit[i]){
                    DFS(i,edges,pathvisit,nodeVisit);
                }
            }
            System.out.println(largestsum);
            System.out.println(count);
        }
        public static void DFS(int i,int[]edges,boolean pathVisit[],boolean nodeVisit[]) {
            pathVisit[i] = true;
            nodeVisit[i] = true;
            if (edges[i] != -1) {
                int adj = edges[i];
                if (!nodeVisit[adj]) {
                    DFS(adj, edges, pathVisit, nodeVisit);
                } else if (pathVisit[adj]) {
                    int curr = adj;
                    int count1 = 0;

                    long sum = 0;
                    do {
                        sum = sum + curr;
                        curr = edges[curr];
                        count1++;
                    } while (curr != adj);
                    if (sum > largestsum) {
                        largestsum = sum;
                        count = count1;
                        largestsum = Math.max(largestsum, sum);

                    }
                }

            }
            pathVisit[i] = false;

        }


}
