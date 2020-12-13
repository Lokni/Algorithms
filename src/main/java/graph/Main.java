package graph;

public class Main {
    public static void homeWork(){
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(0, 5);
        graph.addEdge(1, 2);
        graph.addEdge(2, 8);
        graph.addEdge(2, 9);
        graph.addEdge(2, 6);
        graph.addEdge(3, 2);
        graph.addEdge(4, 3);
        graph.addEdge(5, 7);
        graph.addEdge(5, 6);
        graph.addEdge(5, 2);

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 4);
        System.out.println(bfp.hasPathTo(8));
        System.out.println(bfp.pathTo(8).toString().equals("[3, 2, 8]"));
        System.out.println(bfp.pathTo(8));
    }
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(1,0);

//        System.out.println(graph.getAdjList(1));

//        DepthFirstPaths dfp = new DepthFirstPaths(graph, 2);
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));



        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 2);
        System.out.println(bfp.hasPathTo(0));
        System.out.println(bfp.pathTo(0));

        System.out.println("/Home Work:");
        homeWork();
    }
}
