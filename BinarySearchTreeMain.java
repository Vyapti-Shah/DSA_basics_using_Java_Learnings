public class BinarySearchTreeMain {
    public static void main(String[] args) {
        // Binary Search Tree - A tree that has no more than 2 children , less than 2 children is okay
        //                    - A tree data structure where each node is greater than it's left child, but less than it's right child
        //                    - leftmost child must be smallest value and rightmost child must be largest value

        //                    - benefit = easy to locate a node when they are in this order 
        
        //                    - runtime complexity = Base Case 0(log n)
        //                                         = Worst Case 0(n)
        //                    - space complexity = 0(n)

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new BinarySearchTreeNode(5));
        tree.insert(new BinarySearchTreeNode(1));
        tree.insert(new BinarySearchTreeNode(9));
        tree.insert(new BinarySearchTreeNode(2));
        tree.insert(new BinarySearchTreeNode(7));
        tree.insert(new BinarySearchTreeNode(3));
        tree.insert(new BinarySearchTreeNode(6));
        tree.insert(new BinarySearchTreeNode(4));
        tree.insert(new BinarySearchTreeNode(8));

        tree.display();
        System.out.println();

        System.out.println(tree.search(0));
        System.out.println(tree.search(1));
        System.out.println(tree.search(9));
        System.out.println(tree.search(10));

        tree.remove(0);
        tree.remove(2);
        tree.display();
    }
}
