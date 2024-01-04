//SCC 
//Part-2 , Print the paths in ArrayList
//Same code as Kosaraju but slight changes in storing the values in ArrayList<ArrayList<Integer>>
// Given a Directed Graph with V vertices and E edges, Find the members of strongly connected components in the graph.


// Example 1:

// Input:

// Output:
// 0 1 2,3,4,

import java.util.ArrayList;
import java.util.Comparator;

class ArrayListComparator implements Comparator<ArrayList<Integer>> {
    @Override
    public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Compare the first elements of the two lists
        return list1.get(0).compareTo(list2.get(0));
    }
}
public class TarjanAlgortihm
{
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

    //Function to return a list of lists of integers denoting the members 
    //of strongly connected components in the given graph.  
    public ArrayList<ArrayList<Integer>> tarjans(int V, ArrayList<ArrayList<Integer>> graph) 
    {
    
         Stack<Integer> s = new Stack<>();
         boolean[] vis  = new boolean[V];
         for(int i =0;i<V;i++){
            if(vis[i]==false){
                topological(graph, vis, s, i);
            }
         }
         ArrayList<ArrayList<Integer>>  transpose= new ArrayList<>();
        for(int i =0;i<V;i++){
            transpose.add(new ArrayList<>());
        }
        for(int i =0;i< V;i++){
            vis[i] = false;
            for(int j=0;j<graph.get(i).size();j++){
                int e = graph.get(i).get(j);
                transpose.get(e).add(i);
            }
        }
        
          ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
          while(!s.isEmpty()){
            int temp = s.pop();
            if(vis[temp] == false){
            ArrayList<Integer> res = new ArrayList<>();
            dfs(transpose, vis, temp,res);
            Collections.sort(res);
            ans.add(res);
             
         }
       }
       Collections.sort(ans,new ArrayListComparator());
       return ans;
    }
  static void topological(ArrayList<ArrayList<Integer>> graph,boolean[] vis,Stack<Integer> s,int curr){
        vis[curr] = true;
        for(int i =0;i< graph.get(curr).size();i++){
            int e = graph.get(curr).get(i);
            if(vis[e] == false){
                topological(graph, vis, s, e);
            }      
         }
         s.push(curr);
       
         
    }
    static void dfs(ArrayList<ArrayList<Integer>> graph,boolean[] vis,int curr,ArrayList<Integer> res){
        if(vis[curr]==true){
            return;
        }
        
         
       
        vis[curr] =true;
        res.add(curr);
        for(int i =0;i<graph.get(curr).size();i++){
            int e = graph.get(curr).get(i);
            if(vis[e]==false){
                dfs(graph, vis, e,res);
            }
        }
       
    }  

   public static void main(String[] args) {
      int V = 5;
      ArrayList<ArrayList<Integer>>  graph = new ArrayList<>();
        creategraph(graph, V);
        ArrayList<ArrayList<Integer>> result = tarjans(graph,V);
        System.out.println(result);
   }

    }
    
