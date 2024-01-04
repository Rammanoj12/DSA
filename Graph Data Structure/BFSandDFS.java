import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class edge{
    int src;
    int dest;
    int wt;
    public edge(int src,int dest,int wt){
        this.src= src;
        this.dest =dest;
        this.wt =wt;
    }
}
public class BFSandDFS {
      static void creategraph(ArrayList<edge> graph[],int V){
         for(int i =0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
         }
       
         graph[0].add(new edge(0, 2, -2));

         graph[1].add(new edge(1, 2, -5));
         graph[1].add(new edge(1, 3, -5));
 
         graph[2].add(new edge(2, 0, 10));
         graph[2].add(new edge(2, 1, 10));
          graph[2].add(new edge(2, 3, 10));
 
         graph[3].add(new edge(3, 1, -3));
         graph[3].add(new edge(3, 2, -3));
       

    }

    // static void bfs(ArrayList<edge> graph[],boolean[] vis,int V,int start){
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(start);
    //     while(!q.isEmpty()){
    //         int curr = q.remove();
    //         if(vis[curr] == false){
    //             System.out.print(curr+" ");
    //             vis[curr] =true;

    //             for(int i =0;i<graph[curr].size();i++){
    //                 edge e = graph[curr].get(i);
    //                 q.add(e.dest);
    //             }
    //         }
    //     }
    // }
/////////////////////GFG METHOD//////////////
    // public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    //     ArrayList<Integer>list=new ArrayList<>();
    //     Queue<Integer>q=new LinkedList<>();
    //     boolean visited[]=new boolean[V];
    //     q.add(0);
    //     while(!q.isEmpty()){
    //         int curr=q.remove();
    //         if(!visited[curr]){
    //             list.add(curr);
    //             visited[curr]=true;
    //             for(int i=0;i<adj.get(curr).size();i++){
    //                 q.add(adj.get(curr).get(i));
    //             }
    //         }
    //     }
    //     return list;
    // }
    //////////////////////////////////////////////////
    static void dfs(ArrayList<edge> graph[],boolean[] vis,int curr){
        if(vis[curr]==true){
            return;
        }
        System.out.print(curr+" ");
        vis[curr] =true;
        for(int i =0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(vis[e.dest]==false){
                dfs(graph, vis, e.dest);
            }
        }
    }
    public static void main(String[] args) {
        int V= 5;
        ArrayList<edge> graph[] = new ArrayList[V];
        creategraph(graph,V);
        boolean[] vis = new boolean[V];
        // for(int i =0;i<V;i++){
        //     if(vis[i]==false){
        //         bfs(graph,vis,V,i);
        //     }
            
        // }
         for(int i =0;i<V;i++){
            if(vis[i]==false){
                dfs(graph,vis,i);
            }
            
        }

    }
}
