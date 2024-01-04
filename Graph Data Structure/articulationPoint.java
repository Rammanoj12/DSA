//Tarjan Algorithm -- O(V+E)
//GFG Questions are at bottom 
//Articulation Point -I--O(V+E)
//Articulation Point -II--O(V+E)
import java.util.ArrayList;

public class articulationPoint {
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

    static void dfs(ArrayList<edge> graph[],int curr,int par,int[] discovery_time,int[] lowest_discovery_time,boolean[] vis,int time,boolean[] isArticulation){
        int child =0;
        vis[curr] = true;
        discovery_time[curr] = lowest_discovery_time[curr] = ++time;

        for(int i =0;i<graph[curr].size();i++){
           edge e = graph[curr].get(i);
           //First Case
           if(e.dest == par){
               continue;
           //Second Case
           }else if(vis[e.dest] == false){
               dfs(graph, e.dest, curr, discovery_time, lowest_discovery_time, vis, time,isArticulation);
               lowest_discovery_time[curr] = Math.min(lowest_discovery_time[curr],lowest_discovery_time[e.dest]);
               if(discovery_time[curr]<=lowest_discovery_time[e.dest] && par!=-1){
                   isArticulation[curr]=true;
           }
           child++;
           //Third Case
       }else{
           lowest_discovery_time[curr] = Math.min(lowest_discovery_time[curr],discovery_time[e.dest]);
        }
        
        if(par == -1 && child >1){
            isArticulation[curr]=true;
        }
   }
   }

   static void getArticulationPoint(ArrayList<edge> graph[],int V){
    int[] discovery_time = new int[V];
    int[] lowest_discovery_time = new int[V];
    int time =0;
    boolean[] vis = new boolean[V];
    boolean[] isArticulation = new boolean[V];
    for(int i =0;i<V;i++){
        if(!vis[i]){
            dfs(graph,i,-1, discovery_time, lowest_discovery_time, vis, time,isArticulation);
        }
        }
    
    for(int i =0;i<V;i++){
        if(isArticulation[i]){
            System.out.println(i);
        }
    }
}
    public static void main(String[] args) {
        int V = 6;
        ArrayList<edge> graph[] = new ArrayList[V];
          creategraph(graph, V);
          getArticulationPoint(graph, V);
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////GFG Question/////////////////////////
// Articulation Point - I
// HardAccuracy: 39.26%Submissions: 41K+Points: 8
// 90% Refund available on all premium courses 
// Discover How  

// banner
// Given an undirected connected graph with V vertices and adjacency list adj. You are required to find all the vertices removing which (and edges through it) disconnects the graph into 2 or more components.
// Note: Indexing is zero-based i.e nodes numbering from (0 to V-1). There might be loops present in the graph.

// Example 1:

// Input:

// Output:{1,4}
// Explanation: Removing the vertex 1 will
// discconect the graph as-

// class Solution
// {
//      static void dfs(ArrayList<ArrayList<Integer>> graph,int curr,int par,int[] discovery_time,int[] lowest_discovery_time,boolean[] vis,int time,boolean[] isArticulation){
//         int child =0;
//         vis[curr] = true;
//         discovery_time[curr] = lowest_discovery_time[curr] = ++time;

//         for(int i =0;i<graph.get(curr).size();i++){
//            int e = graph.get(curr).get(i);
//            //First Case
//            if(e == par){
//                continue;
//            //Second Case
//            }else if(vis[e] == false){
//                dfs(graph, e, curr, discovery_time, lowest_discovery_time, vis, time,isArticulation);
//                lowest_discovery_time[curr] = Math.min(lowest_discovery_time[curr],lowest_discovery_time[e]);
//                if(discovery_time[curr]<=lowest_discovery_time[e] && par!=-1){
//                    isArticulation[curr]=true;
//            }
//            child++;
//            //Third Case
//        }else{
//            lowest_discovery_time[curr] = Math.min(lowest_discovery_time[curr],discovery_time[e]);
//         }
        
//         if(par == -1 && child >1){
//             isArticulation[curr]=true;
//         }
//    }
//      }
//     //Function to return Breadth First Traversal of given graph.
//     public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> graph)
//     {
//     ArrayList<Integer> list = new ArrayList<>();
//     int[] discovery_time = new int[V];
//     int[] lowest_discovery_time = new int[V];
//     int time =0;
//     boolean[] vis = new boolean[V];
//     boolean[] isArticulation = new boolean[V];
//     for(int i =0;i<V;i++){
//         if(!vis[i]){
//             dfs(graph,i,-1, discovery_time, lowest_discovery_time, vis, time,isArticulation);
//         }
//         }
    
//     for(int i =0;i<V;i++){
//         if(isArticulation[i]){
//             list.add(i);
//         }
//     }
//         if (list.size() == 0) {
//             list.add(-1);
//         }
//     return list;
//     }
     
// }
///////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
//Articulation point - II
// Given an undirected graph (not necessarily connected) with V vertices and adjacency list adj. 
// You are required to find all the vertices removing which (and edges through it) disconnects the graph into 2 or more components, or in other words, removing which increases the number of connected components.
// Note: Indexing is zero-based i.e nodes numbering from (0 to V-1). There might be loops present in the graph.

// Example 1:

// Input:

// Output:{1,4}
// Explanation: Removing the vertex 1 will
// discconect the graph as-
// class Solution
// {
//     static void dfs(ArrayList<ArrayList<Integer>> graph,int curr,int par,int[] discovery_time,int[] lowest_discovery_time,boolean[] vis,int time,boolean[] isArticulation,ArrayList<Integer> res){
        
//         vis[curr] = true;
//         discovery_time[curr] = lowest_discovery_time[curr] = time++;
//         int child =0;
//         for(int i =0;i<graph.get(curr).size();i++){
//            int e = graph.get(curr).get(i);
//            //First Case
//            if(e == par){
//                continue;
//            //Second Case
//            } 
//            if(vis[e] == false){
//                dfs(graph, e, curr, discovery_time, lowest_discovery_time, vis, time,isArticulation,res);
//                lowest_discovery_time[curr] = Math.min(lowest_discovery_time[curr],lowest_discovery_time[e]);
//                if(discovery_time[curr]<=lowest_discovery_time[e] && par!=-1){
//                    isArticulation[curr]=true;
//            }
//            child++;
//            //Third Case
//        }else{
//            lowest_discovery_time[curr] = Math.min(lowest_discovery_time[curr],discovery_time[e]);
//         }
        
//         }
        
//         if((child>1 && par==-1) || (par!=-1 && isArticulation[curr]==true)){
//             isArticulation[curr]=true;
//             res.add(curr);
//         }
//    }
    
     
//     public int[] articulationPoints(int V, ArrayList<ArrayList<Integer>> graph)
//     {
      
//     int[] discovery_time = new int[V];
//     int[] lowest_discovery_time = new int[V];
//     int time =0;
//     boolean[] vis = new boolean[V];
//     boolean[] isArticulation = new boolean[V];
//     ArrayList<Integer> res=new ArrayList<>();
//     for(int i =0;i<V;i++){
//         if(!vis[i]){
//             dfs(graph,i,-1, discovery_time, lowest_discovery_time, vis, time,isArticulation,res);
//         }
//         }
//         Collections.sort(res);
//       int[] ans = new int[res.size()];
//     for(int i =0;i<res.size();i++){
          
//               ans[i] = res.get(i);
          
            
//     }
//     if(ans.length == 0){
//         ans = new int[]{-1};
//     }
    
    
        
//     return ans ; 
//     }
// }