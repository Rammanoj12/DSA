//Minimum Spanning Tree
import java.util.ArrayList;
import java.util.PriorityQueue;

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

 class pair implements Comparable<pair>{
    int node;
    int dist;
    public pair(int node,int dist){
        this.node = node;
        this.dist = dist;
    }
    @Override
    public int compareTo(pair p){
        return this.dist-p.dist;
    }
}

public class prims {
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
static void printalgo(ArrayList<edge> graph[],int V){
       boolean[] vis = new boolean[V];
       PriorityQueue<pair> pq = new PriorityQueue<>();
       pq.add(new pair(0, 0));
       int cost  =0;
       while(!pq.isEmpty()){
        pair curr =pq.remove();
        if(vis[curr.node] == false){
            vis[curr.node] = true;
            cost+=curr.dist;
            for(int i =0;i<graph[curr.node].size();i++){
                edge e = graph[curr.node].get(i);
                if(vis[e.dest] == false){
                    pq.add(new pair(e.dest, e.wt));
                }
            }
        }
       }
       System.out.println(cost);
}

    public static void main(String[] args) {
        int V= 6;
        ArrayList<edge> graph[] = new ArrayList[V];
        creategraph(graph,V);
       printalgo(graph,V);
    }
}
///////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////
// Given a weighted, undirected and connected graph of V vertices and E edges. 
// The task is to find the sum of weights of the edges of the Minimum Spanning Tree. 
// Given adjacency list adj as input parameters . Here adj[i] contains vectors of size 2, 
// where the first integer in that vector denotes the end of the edge and the second integer denotes the edge weight.

 

// Example 1:

// Input:
// 3 3
// 0 1 5
// 1 2 3
// 0 2 1

// Output:
// 4
// Explanation:

// The Spanning Tree resulting in a weight
// of 4 is shown above.
//code in gfg
// class Pair {
//     int node;
//     int dis;

//     public Pair(int node, int dis) {
//         this.node = node;
//         this.dis = dis;
//     }
// }

// class Solution {
//     static int spanningTree(int V, int E, int edges[][]) {
//         ArrayList<ArrayList<Pair>> adj = new ArrayList<>(V);
//         for (int i = 0; i < V; i++) {
//             adj.add(new ArrayList<>());
//         }

//         for (int i = 0; i < E; i++) {
//             int u = edges[i][0];
//             int v = edges[i][1];
//             int weight = edges[i][2];
//             adj.get(u).add(new Pair(v, weight));
//             adj.get(v).add(new Pair(u, weight));
//         }

//         PriorityQueue<Pair> pq = new PriorityQueue<>((a , b) -> a.dis - b.dis);
//         int[] vis = new int[V];
//         pq.add(new Pair(0, 0));
//         int sum = 0;

//         while (!pq.isEmpty()) {
//             Pair p = pq.poll();
//             int node = p.node;
//             int dis = p.dis;

//             if (vis[node] == 0) {
//                 vis[node] = 1;
//                 sum += dis;

//                 for (Pair pair : adj.get(node)) {
//                     int adjnode = pair.node;
//                     int weight = pair.dis;

//                     if (vis[adjnode] == 0) {
//                         pq.add(new Pair(adjnode, weight));
//                     }
//                 }
//             }
//         }

//         return sum;
//     }
// }