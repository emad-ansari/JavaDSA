package trees;

public class BST{
    
    class Node {
        private int value, height;
        protected Node left;
        protected Node right;

        Node (int value) {
            this.value = value;
            this.height = 0;
        }
        public int getValue(){
            return this.value;
        }

    }
    protected Node root;

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
    public Node deleteInBST(Node node, int key) {
        if (key < node.value){
            node.left = deleteInBST(node.left, key);
        }
        else if (key > node.value ){
            node.right = deleteInBST(node.right, key);
        }
        else {
            // means that node is the key that we have to delete
            if (node.left == null){
                Node temp = node.right;
                return temp;
            }
            else if (node.right == null){
                Node temp = node.left;
                return temp;
            }
            Node temp = inorderSuccessor(node.right);
            node.value = temp.value;
            node.right = deleteInBST(node.right, temp.value);
        }
        return node;
    }

    private Node inorderSuccessor(Node node) {
        Node temp = node;
        while (temp != null && temp.left != null){
            temp = temp.left;
        }
        return temp;
    }


    public void populatedSorted(int[] nums, int start, int end) {
        if (start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        this.insert(nums[mid]);

        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
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


    public void preOrderTraversal() {
        traversal(root);
    }

    private void traversal(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.value);
        traversal(node.left);
        traversal(node.right);
    }

    public void display(){
        display(root, "Root Node : ");
    }


    public boolean searchNode(Node node, int key) {
        if (node == null){
            return false;
        }

        if (node.value == key){
            return true;
        }
        if (key < node.value){
            return searchNode(node.left, key);
        }
        if (key > node.value){
            return searchNode(node.right, key);
        }
        return false;
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
