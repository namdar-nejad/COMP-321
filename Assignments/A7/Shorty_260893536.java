import java.util.*;

public class Shorty {
    public static void main(String[] args) {
        int a; int b; Node curNode;
        ArrayList<ArrayList<Node>>graph; TreeSet<Node> minSet;
        Scanner sc = new Scanner(System.in);
        double[] height; boolean[] visited;

        while (true) {
            a = sc.nextInt(); b = sc.nextInt(); graph = new ArrayList<>();

            // end of input
            if (a == 0 && b == 0) break;

            // initilize the graph
            for (int i = 0; i < a; i++) graph.add(new ArrayList<Node>());

            // create tree set to keep track of the closest 
            minSet = new TreeSet<>();
            for (int i = 0; i < a; i++) minSet.add(new Node(i, 0.));
            minSet.remove(new Node(0, 0)); minSet.add(new Node(0, 1));
            height = new double[a]; height[0] = 1; visited = new boolean[a];

            // read the input and store in graph as nodes
            for (int i = 0; i < b; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                double shrinkFactor = sc.nextDouble();
                graph.get(start).add(new Node(end, shrinkFactor));
                graph.get(end).add(new Node(start, shrinkFactor));
            }

            // for each Node in the TreeSet take the smallest value of the set
            // if it's null then we have reached the end
            for (int i = 0; i < a - 1; i++) {
                Node first = minSet.pollFirst();
                if (first == null) break;
                int node = first.vertex;
                double shrinkFactor = first.shrinkFactor;
                visited[node] = true;

                for (int j = 0; j < graph.get(node).size(); j++) {
                    curNode = graph.get(node).get(j);

                    if (!visited[curNode.vertex]) {
                        if (height[curNode.vertex] < shrinkFactor * curNode.shrinkFactor) {

                            minSet.remove(new Node(curNode.vertex, height[curNode.vertex]));
                            height[curNode.vertex] = shrinkFactor * curNode.shrinkFactor;
                            minSet.add(new Node(curNode.vertex, curNode.shrinkFactor * shrinkFactor));
                        }
                    }
                }

            }

            // print the result with 4 decimal points
            System.out.println(String.format("%.4f", height[height.length - 1]));
        }
    }

    // object to keep track of the (vertex, shrink) pairs
    static class Node implements Comparable<Node> {
        int vertex;
        double shrinkFactor;

        // constructor
        public Node(int vertex, double shrinkFactor) {
            this.vertex = vertex;
            this.shrinkFactor = shrinkFactor;
        }

        // used by the treeSet
        // if the vertex values are the same then the two objects are the same
        // if not, the object is bigger that has a larger shrink factor
        public int compareTo(Node o) {
            if (o.vertex == this.vertex) return 0;
            int compare = Double.compare(o.shrinkFactor, this.shrinkFactor);
            if (compare == 0) return -1;
            return compare;
        }
    }
}


// Disclaimer: I have used online resources to figure out this solution,
// however I have changed the code to my own way and understood how/why it works.

