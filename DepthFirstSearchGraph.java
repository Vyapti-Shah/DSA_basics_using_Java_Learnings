import java.util.ArrayList;

public class DepthFirstSearchGraph {
    ArrayList<DepthFirstSearchNode> nodes;
    int[][] matrix;

    DepthFirstSearchGraph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    public void addNode(DepthFirstSearchNode node){
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
        for(DepthFirstSearchNode node : nodes){
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
    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dSFHealper(src, visited);
    }
    private void dSFHealper(int src, boolean[] visited) {
        if (visited[src]) {
            return;
        }
        else{
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }
        for(int i = 0; i < matrix[src].length; i++){
            if (matrix[src][i] == 1) { //src=row i=column
                dSFHealper(i, visited); //recursive function
            }
        }
        return;
    }
}
