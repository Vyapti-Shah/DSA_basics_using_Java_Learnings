import java.util.ArrayList;

public class AdjacencyMatrixGraph {
    ArrayList<AdjacencyMatrixNode> nodes;
    int[][] matrix;
    AdjacencyMatrixGraph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    public void addNode(AdjacencyMatrixNode node){
        nodes.add(node);
    }
    public void addEdge(int src, int destination){
        matrix[src][destination] = 1;
    }
    public boolean checkEdge(int src, int destination){
        if (matrix[src][destination] == 1) {
            return true;
        }
        else{
            return false;
        }
    }
    public void print(){
        System.out.print("  ");
        for(AdjacencyMatrixNode node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
        for(int i = 0; i < matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            } 
            System.out.println();
        }
    }
}
