package practice.exam;


class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Preorder {
    Node root;
    public Preorder() {
        root = null;
    }
    // Recursive function to perform preorder traversal
    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    // Wrapper method to start the preorder traversal
    public void printPreOrderTraversal() {
        preOrderTraversal(root);
        System.out.println();
    }
    public static void main(String[] args) {
        Preorder tree = new Preorder();

        // Constructing a sample binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Preorder Traversal of the binary tree: ");
        tree.printPreOrderTraversal();
    }
}