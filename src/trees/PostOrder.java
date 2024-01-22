package trees;

public class PostOrder extends BST {

    public void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.getValue() + " ");
    }

    
}
