public class DepthFirstSearch {
    public static void main(String[] args) {
        //Depth First Search - a search algorithm for transvering a tree or graph data structure
        //                   - Step 1 = Pick a route
        //                   - Step 2 = Keep going until you reach a dead end or a previously visited node
        //                   - Step 3 = Backtrack to last node that has unvisited adjacent neighbors

        DepthFirstSearchGraph graph = new DepthFirstSearchGraph(5);
        graph.addNode(new DepthFirstSearchNode('A'));
        graph.addNode(new DepthFirstSearchNode('B'));
        graph.addNode(new DepthFirstSearchNode('C'));
        graph.addNode(new DepthFirstSearchNode('D'));
        graph.addNode(new DepthFirstSearchNode('E'));

        graph.addEdge(0, 1); //(A, B)
        graph.addEdge(1, 2); //(B, C)
        graph.addEdge(2, 3); //(C, D)
        graph.addEdge(2, 4); //(C, E)
        graph.addEdge(4, 0); //(E, A)
        graph.addEdge(4, 2); //(E, C)

        graph.print();

        System.out.println(graph.checkEdge(0, 1));
        System.out.println(graph.checkEdge(3, 2));

        graph.depthFirstSearch(0); //A
        System.out.println();
        graph.depthFirstSearch(1); //B
        System.out.println();
        graph.depthFirstSearch(2); //C
        System.out.println();
        graph.depthFirstSearch(3); //D /cannot go anywhere from D
        System.out.println();
        graph.depthFirstSearch(4); //E

    }
}
