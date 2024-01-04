import java.util.ArrayList;
class edge {
    int src;
    int dest;
    int wt;

    public edge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
}
public class bridgeingraphs {
      static void creategraph(ArrayList<edge> graph[], int V) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }

        graph[0].add(new edge(0, 1, -2));
        graph[0].add(new edge(0, 2, -2));
        graph[0].add(new edge(0, 3, -5));
        

        graph[1].add(new edge(1, 0, -5));
        graph[1].add(new edge(1, 2, -5));
       

        
        graph[2].add(new edge(2, 0, 10));
         graph[2].add(new edge(2, 1, 10));
        

        graph[3].add(new edge(3, 0, -3));
        graph[3].add(new edge(3, 4, -3));

         graph[4].add(new edge(4, 3, -3));
          graph[4].add(new edge(4, 5, -3));

           graph[5].add(new edge(5, 3, -3));
            graph[5].add(new edge(5, 5, -3));
        
    }
    static void dfs(ArrayList<edge> graph[],int curr,int par,int[] discovery_time,int[] lowest_discovery_time,boolean[] vis,int time){
         vis[curr] = true;
         discovery_time[curr] = lowest_discovery_time[curr] = ++time;

         for(int i =0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            //First Case
            if(e.dest == par){
                continue;
            //Second Case
            }else if(vis[e.dest] == false){
                dfs(graph, e.dest, curr, discovery_time, lowest_discovery_time, vis, time);
                lowest_discovery_time[curr] = Math.min(lowest_discovery_time[curr],lowest_discovery_time[e.dest]);
                if(discovery_time[curr]<lowest_discovery_time[e.dest]){
                    System.out.println("Brige is:"+curr+"-----"+e.dest);
            }
            //Third Case
        }else{
            lowest_discovery_time[curr] = Math.min(lowest_discovery_time[curr],discovery_time[e.dest]);
         }
         
    }
    }

    static void getBridge(ArrayList<edge> graph[],int V){
        int[] discovery_time = new int[V];
        int[] lowest_discovery_time = new int[V];
        int time =0;
        boolean[] vis = new boolean[V];
        for(int i =0;i<V;i++){
            if(!vis[i]){
                dfs(graph,i,-1, discovery_time, lowest_discovery_time, vis, time);
            }
            }
        }
    
    public static void main(String[] args) {
        int V = 6;
        ArrayList<edge> graph[] = new ArrayList[V];
          creategraph(graph, V);
          getBridge(graph, V);
    }
}
/////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////
// Given a Graph of V vertices and E edges and another edge(c - d), 
// the task is to find if the given edge is a Bridge. i.e., removing the edge disconnects the graph.

 

// Example 1:

// Input:

// c = 1, d = 2
// Output:
// 1
// Explanation:
// From the graph, we can clearly see that
// blocking the edge 1-2 will result in 
// disconnection of the graph. So, it is 
// a Bridge and thus the Output 1.
// class Solution
// {
//     //Function to find if the given edge is a bridge in graph.
//     static int time =1;
//     static boolean dfs(ArrayList<ArrayList<Integer>> graph,int curr,int par,int c,int d,int[] discovery_time,int[] lowest_discovery_time,boolean[] vis){
//          vis[curr] = true;
//          discovery_time[curr] = lowest_discovery_time[curr] = time++;

//          for(int i =0;i<graph.get(curr).size();i++){
//             int e = graph.get(curr).get(i);
//             //First Case
//             if(e == par){
//                 continue;
//             //Second Case
//             }else if(vis[e] == false){
//                 if(dfs(graph, e, curr, c,d,discovery_time, lowest_discovery_time, vis)==true){
//                     return true;
//                 }
//                 lowest_discovery_time[curr] = Math.min(lowest_discovery_time[curr],lowest_discovery_time[e]);
//                 if(discovery_time[curr]<lowest_discovery_time[e] && ((curr == c && e == d) ||(curr == d && e == c) )){
//                     return true;
//             }
//             //Third Case
//         }else{
//             lowest_discovery_time[curr] = Math.min(lowest_discovery_time[curr],discovery_time[e]);
//          }
         
//     }
//     return false;
//     }
//     static int isBridge(int V, ArrayList<ArrayList<Integer>> graph,int c,int d)
//     {
//        int[] discovery_time = new int[V];
//         int[] lowest_discovery_time = new int[V];
        
//         boolean[] vis = new boolean[V];
        
//         for(int i =0;i<V;i++){
//             if(!vis[i]){
//                if(dfs(graph,i,-1,c,d, discovery_time, lowest_discovery_time, vis)){
//                    return 1;
//                }
//             }
//             }
//              return 0;
//         }
       
// }
    