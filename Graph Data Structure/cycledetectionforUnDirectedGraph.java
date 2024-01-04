import java.util.ArrayList;

class body {
    int source, destination, weight;

    public body(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}
public class cycledetectionforUnDirectedGraph {
    static void creategraph(ArrayList<body> graph[], int V) {
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new body(0, 2, -2));

        graph[1].add(new body(1, 2, -5));
        graph[1].add(new body(1, 3, -5));

        graph[2].add(new body(2, 0, 10));
        graph[2].add(new body(2, 1, 10));
         graph[2].add(new body(2, 3, 10));

        graph[3].add(new body(3, 1, -3));
        graph[3].add(new body(3, 2, -3));
    }

      static boolean isCyclic(ArrayList<body> graph[], int V) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCyclicUtil(graph, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean isCyclicUtil(ArrayList<body> graph[], int curr, boolean[] visited,int parent) {
        visited[curr] = true;
        
  for(int i =0;i<graph[curr].size();i++){
    body e = graph[curr].get(i);
    if(visited[e.destination] == true && e.destination !=parent){
        return true;
    
  }else if(visited[e.destination] == false){
      if(isCyclicUtil(graph, e.destination, visited, curr)){
        return true;
      }
  }
  
  }
  return false;
}
    public static void main(String[] args) {
        int V= 5;
        ArrayList<body> graph[] = new ArrayList[V];
        creategraph(graph,V);
        boolean hascycle = isCyclic(graph, V);
        System.out.println("Cycle detected: " + hascycle);
    }

}
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
//GFG
// Given an undirected graph with V vertices and E bodys, 
//check whether it contains any cycle or not. Graph is in the form of adjacency list where adj[i] contains all the nodes ith node is having body with.

// Example 1:

// Input:  
// V = 5, E = 5
// adj = {{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}} 
// Output: 1
// Explanation: 

// 1->2->3->4->1 is a cycle.

// class Solution {
//     // Function to detect cycle in an undirected graph.
//     public boolean isCycle(int V, ArrayList<ArrayList<Integer>> graph) {
//          boolean[] visited = new boolean[V];

//         for (int i = 0; i < V; i++) {
//             if (!visited[i]) {
//                 if (isCyclicUtil(graph, i, visited, -1)) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
    
//      private static boolean isCyclicUtil( ArrayList<ArrayList<Integer>> graph, int curr, boolean[] visited,int parent) {
//         visited[curr] = true;
        
//   for(int i =0;i<graph.get(curr).size();i++){
//     int e = graph.get(curr).get(i);
//     if(visited[e] == true && e !=parent){
//         return true;
    
//   }else if(visited[e] == false){
//       if(isCyclicUtil(graph, e, visited, curr)){
//         return true;
//       }
//   }
  
//   }
//   return false;
// }
    
//     }
