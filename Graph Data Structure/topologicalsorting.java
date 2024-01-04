import java.util.ArrayList;
import java.util.Stack;
class edge{
    int src;
    int dest;
    int wt;
    public edge(int src,int dest,int wt){
        this.src= src;
        this.dest =dest;
        this.wt = wt;
    }
}
public class topologicalsorting  {
    static void creategraph(ArrayList<edge> graph[],int V){
         for(int i =0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
         }
       
         
        
 
        
          graph[0].add(new edge(0, 1,2));

         graph[1].add(new edge(1,2,1));
         graph[2].add(new edge(2,3,1));
         graph[4].add(new edge(4,2,1));

         

        
       

    }
    static void topological(ArrayList<edge> graph[],boolean[] vis,Stack<Integer> s,int curr){
        vis[curr] = true;
        for(int i =0;i< graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                topological(graph, vis, s, e.dest);
            }      
         }
         s.push(curr);
       
         
    }
    public static void main(String[] args) {
        int V= 5;
        ArrayList<edge> graph[] = new ArrayList[V];
        creategraph(graph,V);
        boolean[] vis = new boolean[V];
        Stack<Integer> s = new Stack<>();
        for(int i =0;i<V;i++){
            if(vis[i]==false){
          topological(graph,vis,s,i);
            }
            
        }
          while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
         }
    }
}
///////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////

// Given a Directed Acyclic Graph of N vertices from 0 to N-1 and a 2D Integer array(or vector) edges[ ][ ] of length M, where there is a directed edge from edge[i][0] to edge[i][1] with a distance of edge[i][2] for all i.

// Find the shortest path from src(0) vertex to all the vertices and if it is impossible to reach any vertex, then return -1 for that vertex.

// Example1:

// Input:
// N = 4, M = 2
// edge = [[0,1,2],[0,2,1]]
// Output:
// 0 2 1 -1
// Explanation:
// Shortest path from 0 to 1 is 0->1 with edge weight 2. 
// Shortest path from 0 to 2 is 0->2 with edge weight 1.
// There is no way we can reach 3, so it's -1 for 3.
// Example2:

// Input:
// N = 6, M = 7
// edge = [[0,1,2],[0,4,1],[4,5,4],[4,2,2],[1,2,3],[2,3,6],[5,3,1]]
// Output:
// 0 2 3 6 1 5
// Explanation:
// Shortest path from 0 to 1 is 0->1 with edge weight 2. 
// Shortest path from 0 to 2 is 0->4->2 with edge weight 1+2=3.
// Shortest path from 0 to 3 is 0->4->5->3 with edge weight 1+4+1=6.
// Shortest path from 0 to 4 is 0->4 with edge weight 1.
// Shortest path from 0 to 5 is 0->4->5 with edge weight 1+4=5.
// Your Task:

// You don't need to print or input anything. Complete the function shortest path() which takes an integer N as number of vertices, an integer M as number of edges and a 2D Integer array(or vector) edges as the input parameters and returns an integer array(or vector), denoting the list of distance from src to all nodes.

// Expected Time Complexity: O(N+M), where N is the number of nodes and M is edges
// Expected Space Complexity: O(N)
// class Pair {
//   int first, second;
//   Pair(int first, int second) {
//     this.first = first;
//     this.second = second;
//   }
// }
// class Solution {
//     private void topoSort(int node, ArrayList < ArrayList < Pair >> adj,
//         int vis[], Stack < Integer > st) {
//         //This is the function to implement Topological sort. 
    
//         vis[node] = 1;
//         // for (int i = 0; i < adj.get(node).size(); i++) {
//         //   int v = adj.get(node).get(i).first;
//         //   if (vis[v] == 0) {
//         //     topoSort(v, adj, vis, st);
//         //   }
//         // }
//         for(Pair x : adj.get(node))
//         {
//             int v = x.first;
//             if(vis[v] == 0)
//             {
//                 topoSort(v, adj, vis, st);
//             }
//         }
//         st.add(node);
//    }
//     public int[] shortestPath(int N,int M, int[][] edges) {
//         ArrayList < ArrayList < Pair >> adj = new ArrayList < > ();
//         for (int i = 0; i < N; i++) {
//           ArrayList < Pair > temp = new ArrayList < Pair > ();
//           adj.add(temp);
//         }
//         //We create a graph first in the form of an adjacency list.
    
//         for (int i = 0; i < M; i++) {
//           int u = edges[i][0];
//           int v = edges[i][1];
//           int wt = edges[i][2];
//           adj.get(u).add(new Pair(v, wt));
//         }
//         int vis[] = new int[N];
//         //Now, we perform topo sort using DFS technique 
//         //and store the result in the stack st.
    
//         Stack < Integer > st = new Stack < > ();
//         for (int i = 0; i < N; i++) {
//           if (vis[i] == 0) {
//             topoSort(i, adj, vis, st);
//           }
//         }
//         //Further, we declare a vector ‘dist’ in which we update the value of the nodes’
//         //distance from the source vertex after relaxation of a particular node.
//         int dist[] = new int[N];
//         for (int i = 0; i < N; i++) {
//           dist[i] = (int)(1e9);
//         }
    
//         dist[0] = 0;
//         while (!st.isEmpty()) {
//           int node = st.peek();
//           st.pop();
    
//         //   for (int i = 0; i < adj.get(node).size(); i++) {
//         //     int v = adj.get(node).get(i).first;
//         //     int wt = adj.get(node).get(i).second;
    
//         //     if (dist[node] + wt < dist[v]) {
//         //       dist[v] = wt + dist[node];
//         //     }
//         //   }
//              for(Pair x : adj.get(node))
//              {
//                  int v = x.first;
//                  int wt = x.second;
//                  if(dist[node] + wt < dist[v])
//                  {
//                      dist[v] = dist[node] +  wt;
//                  }
//              }
//         }
    
//         for (int i = 0; i < N; i++) {
//           if (dist[i] == 1e9) dist[i] = -1;
//         }
//         return dist;
//     }
// }