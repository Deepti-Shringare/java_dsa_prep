import java.util.*;

public class KahnsAlgorithmWithEdgeClass {

    static class Edge {
        int src, dest;

        public Edge(int a, int d) {
            this.src = a;
            this.dest = d;
        }
    }

    // Method to create the graph
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 5));
    }

    static void topologicalSort(ArrayList<Edge> graph[], int V) {
        int[] inDegree = new int[V];

        // Step 1: Calculate in-degrees
        for (int i = 0; i < V; i++) {
            for (Edge e : graph[i]) {
                inDegree[e.dest]++;
            }
        }

        // Step 2: Add all vertices with in-degree 0 to the queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 3: Process the queue
        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int curr = q.poll();
            topo.add(curr);

            for (Edge e : graph[curr]) {
                inDegree[e.dest]--;
                if (inDegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }

        // Step 4: Check if topological sort is possible
        if (topo.size() != V) {
            System.out.println("Graph has a cycle. Topological sort not possible.");
        } else {
            System.out.println("Topological Sort: " + topo);
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topologicalSort(graph, V);
    }
}

