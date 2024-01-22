package trees;

public class PreOrderTraversal extends BST {

    // Pre Order traversal is used in  evaluate the mathematical expression.
    // first we will go for left and then for right


    public void preOrderTraversal(Node root) {
        travers(root);
    }

    private void travers(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.getValue() + " ");
        travers(node.left);
        travers(node.right);
    }
    
}
