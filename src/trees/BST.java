package trees;

public class BST {
    
    class Node {
        private int value, height;
        private Node left;
        private Node right;

        Node (int value) {
            this.value = value;
            height = 0;
        }
        public int getValue(){
            return this.value;
        }

    }
    private Node root;

    public BST() {
        root = null;
    }

    public int heightOf(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root); 
    }

    private Node insert(int value, Node node) {
        if (node == null){
            node = new Node(value);
            return node;
        }
        if (value < node.value){
            node.left = insert(value, node.left);
        }
        if (value > node.value){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(heightOf(node.left), heightOf(node.right)) + 1;
        return node;
    
    }
    public void remove(int vlaue) {
        


    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {

        if (node == null){
            return true;
        }

        return Math.abs(heightOf(node.left) - heightOf(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void display(){
        display(root, "Root Node : ");
    }

    private void display(Node node, String details) {
        if (node == null){
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + ": ");
        display(node.right, "Right child of  " + node.value + ": ");

    }
    
}
