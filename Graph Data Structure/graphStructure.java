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
public class graphStructure {
    static void creategraph(ArrayList<edge> graph[],int V){
         for(int i =0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
         }
       
         graph[0].add(new edge(0, 2, -2));

         graph[1].add(new edge(1, 2, -5));
         graph[1].add(new edge(1, 3, -5));
 
         graph[2].add(new edge(2, 0, 10));
         graph[2].add(new edge(2, 1, 10));
          graph[2].add(new edge(2, 3, 10));
 
         graph[3].add(new edge(3, 1, -3));
         graph[3].add(new edge(3, 2, -3));
       

    }
    public static void main(String[] args) {
        int V= 5;
        ArrayList<edge> graph[] = new ArrayList[V];
        creategraph(graph,V);
        for(int i =0;i<graph[1].size();i++){
            edge e = graph[1].get(i);
            System.out.print(e.src+" -> "+e.wt+" -> "+e.dest);
        }
    }
}
