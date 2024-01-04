import java.util.ArrayList;
import java.util.Arrays;
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

public class dijkstra {
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
   static void dijkstramethod(ArrayList<edge> graph[],int src,int V){
            PriorityQueue<pair> pq = new PriorityQueue<>();
            int[] distance = new int[V];
            for(int i =0;i<V;i++){
                if(i!=src){
                    distance[i] = Integer.MAX_VALUE;
                }
            }
            boolean[] vis = new boolean[V];
            pq.add(new pair(0, 0));
            while(!pq.isEmpty()){
                pair curr = pq.remove();
                if(vis[curr.node]==false){
                    vis[curr.node] =true;
                    for(int i =0;i<graph[curr.node].size();i++){
                        edge e = graph[curr.node].get(i);
                        int u = e.src;
                        int v = e.dest;
                        
                        if(distance[u]+e.wt<distance[v]){
                            distance[v] = distance[u]+e.wt;
                            pq.add(new pair(v, distance[v]));
                        }
                       
                    }
                     
                }
            }
            //Printing the distances
           for(int i =0;i<V;i++){
            System.out.print(distance[i]+" ");
           }
           System.out.println();
   }


    public static void main(String[] args) {
        int V= 6;
        ArrayList<edge> graph[] = new ArrayList[V];
        creategraph(graph,V);
        dijkstramethod(graph,0,V);
    }
}
//////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
//Another method
//   class Pair{
//         int dist;
//         int node;
//         Pair(int _dist,int _node){
//             this.dist=_dist;
//             this.node=_node;
//         }
//     }

// class Solution
// {
//     //Function to find the shortest distance of all the vertices
//     //from the source vertex S.
    
//     // Priority Queue ::
//     static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
//     {

//         PriorityQueue<Pair> pq =new PriorityQueue<>((a,b)->((a.dist==b.dist)?(a.node-b.node):(a.dist-b.dist)));
//         int[] dist =new int[V];
//         Arrays.fill(dist,(int)1e6);
        
//         pq.offer(new Pair(0,S));
//         dist[S]=0;
//         while(!pq.isEmpty()){
//             int node = pq.peek().node;
//             int dis =pq.peek().dist;
//             pq.poll();
//             for(List<Integer> temp: adj.get(node)){
//                 int currNode =temp.get(0);
//                 if(dis+temp.get(1)<dist[currNode]){
//                     dist[currNode] =dis+temp.get(1);
//                     pq.offer(new Pair(dist[currNode],currNode));
//                 }
                
//             }
//         }
//         return dist;
//     }