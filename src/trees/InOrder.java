package trees;

public class InOrder extends BST{
    // In order traversal mean it will print the left node and then current node and then right node 
    // node.left -> node -> node.right
    public void inOrderTraversal(Node node) {
        if (node == null) return;

        inOrderTraversal(node.left);

        System.out.print(node.getValue() + " ");

        inOrderTraversal(node.right);

    }
    
}
