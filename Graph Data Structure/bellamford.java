import java.util.ArrayList;

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

public class bellamford {
    static void creategraph(ArrayList<edge> graph[],int V){
        for(int i =0;i<graph.length;i++){
           graph[i] = new ArrayList<edge>();
        }
      
        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));

        graph[1].add(new edge(1, 3, 7));
        graph[1].add(new edge(1, 2, 1));

        graph[2].add(new edge(2, 4, 3));
        

        graph[3].add(new edge(3, 5, 1));

        graph[4].add(new edge(4, 3, 2));
        graph[4].add(new edge(4, 5, 5));
        
      

   }
   static void bellamford(ArrayList<edge> graph[],int src,int V){
    int [] dis = new int[V];
    for(int i =0;i<V;i++){
        if(i!=src){
            dis[i] = Integer.MAX_VALUE;
        }
    }
    for(int i =0;i<V-1;i++){
        for(int j =0;j<V;j++){
            for(int k =0;k<graph[j].size();k++){
                edge e = graph[j].get(k);
                int u = e.src;
                int v = e.dest;
                int wt= e.wt;
                if(dis[u]+wt<dis[v] && dis[u]!= Integer.MAX_VALUE){
                    dis[v]=dis[u]+wt;
                }
            }
        }
    }

    for(int i =0;i<V;i++){
        System.out.print(dis[i]+" ");
    }
  System.out.println();
   }
    public static void main(String[] args) {
        int V= 6;
        ArrayList<edge> graph[] = new ArrayList[V];
        creategraph(graph,V);
        bellamford(graph, 0, V);
    }
}
////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////
//GFG CODE -- Our code is correct but we are printing only path, if we want to check whether cycle exists or not , we need to prefer this code.
// Given a weighted, directed and connected graph of V vertices and E edges, 
//Find the shortest distance of all the vertex's from the source vertex S. 
//If a vertices can't be reach from the S then mark the distance as 10^8. Note: If the Graph contains a negative cycle then return an array consisting of only -1.

// Example 1:

// Input:

// E = [[0,1,9]]
// S = 0
// Output:
// 0 9
// Explanation:
// Shortest distance of all nodes from
// source is printed.
//////////////////////////////////////////
// class Solution{
// static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
//         // Write your code here

//         int[] dist = new int[V];
//         Arrays.fill(dist, 100000000);
//         dist[S] = 0;
        
//         for (int i = 0; i < V - 1; i++) {
//             for (int j = 0; j < edges.size(); j++) {
//                 ArrayList<Integer> e = edges.get(j);
//                 int scr = e.get(0);
//                 int dest = e.get(1);
//                 int wt = e.get(2);
//                 if (dist[scr] != 100000000 && dist[scr] + wt < dist[dest]) {
//                     dist[dest] = dist[scr] + wt;
//                 }
//             }       
//         }
        
//         // To check if cycle exists 
//         // If the cycle exist the distance we will still go down if it goes does we will 
//         // Consider that the graph has negative cycle.
//         for (int j = 0; j < edges.size(); j++) {
//             ArrayList<Integer> e = edges.get(j);
//             int scr = e.get(0);
//             int dest = e.get(1);
//             int wt = e.get(2);
//             if (dist[scr] != 100000000 && dist[scr] + wt < dist[dest]) {
//                 return new int[]{-1};
//             }
//         }   
        
//         return dist;
//     }
// }