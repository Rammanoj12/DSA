import java.util.ArrayList;

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

public class allpathsfromsourceTOtarget {
    static void creategraph(ArrayList<edge> graph[], int V) {
        for (int i = 0; i < graph.length; i++) {
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

    static void allpaths(ArrayList<edge> graph[], boolean[] vis, int curr, int t, String path, int[] pathCount) {
        vis[curr] = true;

        if (curr == t) {
            System.out.println(path); // Print the path when reaching the target
            pathCount[0]++; // Increment pathCount when a path is printed
            vis[curr] = false; // Reset the visitation status for backtracking
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (vis[e.dest] == false) {
                allpaths(graph, vis, e.dest, t, path + " -> " + e.dest, pathCount);
            }
        }

        vis[curr] = false; // Reset the visitation status for backtracking
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<edge> graph[] = new ArrayList[V];
        creategraph(graph, V);
        int[] pathCount = {0}; // Counter for the number of paths
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                allpaths(graph, vis, i, 2, Integer.toString(i), pathCount);
            }
        }

        System.out.print("The Total Count of Paths" + " " + pathCount[0]);
    }
}

