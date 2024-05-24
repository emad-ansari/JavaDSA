package trees;
import java.util.Arrays;
public class ConstructFromPreOrder {
    
    class Node{
        private int value;
        private Node left;
        private Node right;

        Node (int value) {
            this.value = value;
        }
    }

 

    public Node insert(int[] arr){
    
        return constructTree(arr,  Integer.MAX_VALUE , new int[]{0});            
    }

    public Node constructTree(int[] arr, int bound, int[] i) {
        if( i[0] == arr.length || arr[i[0]] > bound){
            return null;
        }
        Node node = new Node(arr[i[0]++]);
        node.left = constructTree(arr, node.value, i);
        node.right = constructTree(arr, bound, i);
        return node;
    }


    public void preorderTraversal(Node node) {

        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);

    }

    public void postorderTraversal(Node node) {

        if (node == null){
            return;
        }

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.value + " ");

    }

    public static void main(String[] args){
        int[] arr = {8, 5, 1, 7, 10, 12};

        ConstructFromPreOrder tree = new ConstructFromPreOrder();
        Node node = tree.insert(arr);
         tree.postorderTraversal(node);
        System.out.println();

    }
    
    
}
