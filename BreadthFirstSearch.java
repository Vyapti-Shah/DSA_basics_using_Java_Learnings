public class BreadthFirstSearch {
    public static void main(String[] args) {
        //Depth First Search - a search algorithm for transvering a tree or graph data structure
        //                   - this is done one "level" at a time, rather than one "branch" at a time

        BreadthFirstSearchGraph graph = new BreadthFirstSearchGraph(5);
        graph.addNode(new BreadthFirstSearchNode('A'));
        graph.addNode(new BreadthFirstSearchNode('B'));
        graph.addNode(new BreadthFirstSearchNode('C'));
        graph.addNode(new BreadthFirstSearchNode('D'));
        graph.addNode(new BreadthFirstSearchNode('E'));

        graph.addEdge(0, 1); //(A, B)
        graph.addEdge(1, 2); //(B, C)
        graph.addEdge(2, 3); //(C, D)
        graph.addEdge(2, 4); //(C, E)
        graph.addEdge(4, 0); //(E, A)
        graph.addEdge(4, 2); //(E, C)

        graph.print();

        System.out.println(graph.checkEdge(0, 1));
        System.out.println(graph.checkEdge(3, 2));

        graph.breadthFirstSearch(0); //A
        System.out.println();
        graph.breadthFirstSearch(1); //B
        System.out.println();
        graph.breadthFirstSearch(2); //C
        System.out.println();
        graph.breadthFirstSearch(3); //D //cannot go anywhere from D
        System.out.println();
        graph.breadthFirstSearch(4); //E

    }
}

//Breadth FS - Traverse a graph level by level 
//           - Utilises a queue
//           - Better if designation is an average close to the start
//           - Siblings are visited before children

//Depth FS - Traverse a graph branch by branch 
//         - Utilises a stack
//         - Better if designation is an average far from the start
//         - Children are visited before siblings
//         - More popular for games/puzzles