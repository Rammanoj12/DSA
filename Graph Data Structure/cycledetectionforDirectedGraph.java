import java.util.ArrayList;

class body {
    int source, destination, weight;

    public body(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

public class cycledetectionforDirectedGraph {
    static boolean isCyclic(ArrayList<body> graph[], int V) {
        boolean[] visited = new boolean[V];
        boolean[] inStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCyclicUtil(graph, i, visited, inStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isCyclicUtil(ArrayList<body> graph[], int v, boolean[] visited, boolean[] inStack) {
        visited[v] = true;
        inStack[v] = true;
  for(int i =0;i<graph[v].size();i++){
    body e = graph[v].get(i);
    if(inStack[e.destination]==true){
        return true;
    }else if(visited[e.destination]==false && isCyclicUtil(graph, e.destination, visited, inStack)){
        return true;
    }
  }
  inStack[v] =false;
  return false;
       
    }

    static void createbody(ArrayList<body> graph[], int V) {
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

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<body> graph[] = new ArrayList[V];
        createbody(graph, V);

        // Check if the body contains a cycle
        boolean hasCycle = isCyclic(graph, V);
        System.out.println("Cycle detected: " + hasCycle);
    }
}

////////////////////////////////////////////////////////////////
//Without using body class and graph[], we can use graph.get(curr).get(i);
    // public static boolean iscycleutil(ArrayList<ArrayList<Integer>> adj,int curr,boolean visited[], boolean stack[])
    // {
    //     visited[curr]=true;
    //     stack[curr]=true;
        
    //     for(int i=0;i<adj.get(curr).size();i++)
    //     {
    //         int dest=adj.get(curr).get(i);
    //         if(stack[dest])
    //         {
    //             return true;
    //         }else if(!visited[dest] && iscycleutil(adj,dest,visited,stack))
    //         {
    //             return true;
    //         }
    //     }
    //     stack[curr]=false;
        
    //     return false;
    // }
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
///GFG Question
// Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E bodys, check whether it contains any cycle or not.


// Example 1:

// Input:



// Output: 1
// Explanation: 3 -> 3 is a cycle

// class Solution {
//     // Function to detect cycle in a directed graph.
//     public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
//         boolean[] visited = new boolean[V];
//         boolean[] inStack = new boolean[V];
      
// for (int i =0;i<adj.size();i++) {
            
//             if (!visited[i]) {
//                 if (iscycleutil(adj, i, visited, inStack)) {
//                     return true;
//                 }
//             } 
//         }

        
//         return false;
//     }

//     public static boolean iscycleutil(ArrayList<ArrayList<Integer>> adj,int curr,boolean visited[], boolean instack[])
//     {
//         visited[curr]=true;
//         instack[curr]=true;
        
//         for(int i=0;i<adj.get(curr).size();i++)
//         {
//             int dest=adj.get(curr).get(i);
//             if(instack[dest])
//             {
//                 return true;
//             }else if(!visited[dest] && iscycleutil(adj,dest,visited,instack))
//             {
//                 return true;
//             }
//         }
//         instack[curr]=false;
        
//         return false;
//     }
// }
