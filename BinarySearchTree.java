public class BinarySearchTree {
    BinarySearchTreeNode root;
    public void insert(BinarySearchTreeNode node){
        root = insertHelper(root, node);
    }

    private BinarySearchTreeNode insertHelper(BinarySearchTreeNode root, BinarySearchTreeNode node) {
        int data = node.data;
        if (root == null) {
            root = node;
            return root;
        }
        else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        }
        else{
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display(){
        displayHelper(root);
    }

    private void displayHelper(BinarySearchTreeNode root){
        if(root != null){ //output is "1 2 3 4 5 6 7 8 9" //for getting reversed output "9 8 7 6 5 4 3 2 1"
            displayHelper(root.left); //displayHelper(root.right);
            System.out.print(root.data + " ");
            displayHelper(root.right); //displayHelper(root.left);
        }
    }

    public boolean search(int data){
        return searchHelper(root, data);
    }

    private boolean searchHelper(BinarySearchTreeNode root, int data){
        if (root == null) {
            return false;
        }
        else if(root.data == data){
            return true;
        }
        else if (root.data > data) {
            return searchHelper(root.left, data);
        }
        else{
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data){
        if (search(data)) {
            removeHelper(root, data);
        }
        else{
            System.out.println(data + " could not be found");
        }
    }

    public BinarySearchTreeNode removeHelper(BinarySearchTreeNode root, int data){
        if (root == null) {
            return root;
        }
        else if(data < root.data){
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data){
            root.right = removeHelper(root.right, data);
        }
        else{ //node found
            if (root.left == null && root.right == null) {
                root = null;
            }
            else if (root.right != null) { //this means there is a right child and we need a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data); //as when we delete a node there will be a gap and so we do not want the child 
                                                                  //to get lost so we link that child to that spot where we deleted the node
            }
            else{  //this means there is a left child and we need a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(BinarySearchTreeNode root){ //find the least value below the right child of this root node
        root = root.right; // step 1: here we go towards the right side from start 
        while (root.left != null) { //step 2: then here we check towards step 1's left side to find the lowest value
            root = root.left;
        }
        return root.data; //then we will return the lowest value found in step 2
    }

    private int predecessor(BinarySearchTreeNode root){ //find the greatest value below the left child of this root node
        root = root.left; // step 1: here we go towards the left side from start 
        while (root.right != null) { //step 2: then here we check towards step 1's right side to find the lowest value
            root = root.right;
        }
        return root.data; //then we will return the lowest value found in step 2
    }
}
