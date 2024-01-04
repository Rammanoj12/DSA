import java.util.*;

class SimpleGraph {
    private Map<Integer, List<Integer>> adjacencyList;

    public SimpleGraph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        // Adding edge from source to destination
        adjacencyList.get(source).add(destination);
        // Adding edge from destination to source (assuming undirected graph)
        adjacencyList.get(destination).add(source);
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjacencyList.getOrDefault(vertex, Collections.emptyList());
    }

    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            int vertex = entry.getKey();
            List<Integer> neighbors = entry.getValue();

            System.out.print(vertex + " -> ");
            for (int neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SimpleGraph graph = new SimpleGraph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);

        System.out.println("Graph Representation:");
        graph.printGraph();

        System.out.println("Neighbors of vertex 2: " + graph.getNeighbors(2));
    }
}
