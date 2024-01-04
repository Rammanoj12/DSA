//Strongly Connected Component
//Part -1 , mixed with printing the paths and total number of paths.
//But in part -2 same SCC implemented with Tarjan's Algorithm only printing paths in ArrayList.
import java.util.ArrayList;
import java.util.Stack;

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

public class KosarajuAlgorithm {
   
    static void creategraph(ArrayList<edge> graph[], int V) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }

        graph[0].add(new edge(0, 2, -2));
        graph[0].add(new edge(0, 3, -2));

        graph[1].add(new edge(1, 0, -5));
       

        
        graph[2].add(new edge(2, 1, 10));
        

        graph[3].add(new edge(3, 4, -3));
        
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
    static void dfs(ArrayList<edge> graph[],boolean[] vis,int curr){
        if(vis[curr]==true){
            return ;
        }
        //Print the path
        ArrayList<Integer> list = new ArrayList<>();
        list.add(curr);
        System.out.print(list);
        vis[curr] =true;
        for(int i =0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(vis[e.dest]==false){
            //    dfs(graph, vis, e.dest,result);
            dfs(graph, vis, e.dest);
            }
        }
       
    }
    // static int kosaraju(ArrayList<edge> graph[],int V){
        static void kosaraju(ArrayList<edge> graph[],int V){
         Stack<Integer> s = new Stack<>();
         boolean[] vis  = new boolean[V];
         for(int i =0;i<V;i++){
            if(vis[i]==false){
                topological(graph, vis, s, i);
            }
         }
        ArrayList<edge> transpose[]= new ArrayList[V];
        for(int i =0;i<V;i++){
            transpose[i] = new ArrayList<edge>();
        }
        for(int i =0;i< V;i++){
            vis[i] = false;
            for(int j=0;j<graph[i].size();j++){
                edge e = graph[i].get(j);
                transpose[e.dest].add(new edge(e.dest, e.src, e.wt));
            }
        }
        // int result =0;

          while(!s.isEmpty()){
           int temp = s.pop();
           if(vis[temp] == false){
            
        //     result++;
        //   dfs(transpose, vis, temp,result);
       
        dfs(transpose, vis, temp);
        
          
           
           }

          }
        //   //
        //   return result;

    }
    public static void main(String[] args) {
        int V = 5;
      ArrayList<edge> graph[] = new ArrayList[V];
        creategraph(graph, V);
        kosaraju(graph,V);
    ///Prints the total no of paths
    //    int no_of_paths= kosaraju(graph,V);
    //    System.out.println(no_of_paths);
    }
}
///////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
// Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, 
// Find the number of strongly connected components in the graph.
 

// Example 1:

// Input:

// Output:
// 3
// class Solution
// {
//     static void topological(ArrayList<ArrayList<Integer>> graph,boolean[] vis,Stack<Integer> s,int curr){
//         vis[curr] = true;
//         for(int i =0;i< graph.get(curr).size();i++){
//             int e = graph.get(curr).get(i);
//             if(vis[e] == false){
//                 topological(graph, vis, s, e);
//             }      
//          }
//          s.push(curr);
       
         
//     }
//     static void dfs(ArrayList<ArrayList<Integer>> graph,boolean[] vis,int curr,int result){
//         if(vis[curr]==true){
            
//             return ;
//         }
        
        
//         vis[curr] =true;
//         for(int i =0;i<graph.get(curr).size();i++){
//             int e = graph.get(curr).get(i);
//             if(vis[e]==false){
//                dfs(graph, vis, e,result);
//             }
//         }
       
//     }
//     //Function to find number of strongly connected components in the graph.
//     public int kosaraju(int V, ArrayList<ArrayList<Integer>> graph)
//     {
//         Stack<Integer> s = new Stack<>();
//          boolean[] vis  = new boolean[V];
//          for(int i =0;i<V;i++){
//             if(vis[i]==false){
//                 topological(graph, vis, s, i);
//             }
//          }
//          ArrayList<ArrayList<Integer>>  transpose= new ArrayList<>();
//         for(int i =0;i<V;i++){
//             transpose.add(new ArrayList<>());
//         }
//         for(int i =0;i< V;i++){
//             vis[i] = false;
//             for(int j=0;j<graph.get(i).size();j++){
//                 int e = graph.get(i).get(j);
//                 transpose.get(e).add(i);
//             }
//         }
//         int result =0;

//           while(!s.isEmpty()){
//            int temp = s.pop();
//            if(vis[temp] == false){
            
//             result++;
//           dfs(transpose, vis, temp,result);
          
           
//            }

//           }
//           return result;
//     }
// }