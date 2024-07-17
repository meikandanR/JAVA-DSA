package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<5;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        ArrayList<Integer>ans=bfsofGraph(5,adj);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
    public static ArrayList<Integer> bfsofGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer>bfs=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        boolean[] vis=new boolean[v];
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            for(int it:adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;

    }
}
