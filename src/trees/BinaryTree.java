package trees;

import java.util.Scanner;

public class BinaryTree {

    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }
    } 

    private Node root;

    public void populate(Scanner scanner){
        System.out.print("Enter the root Node value: ");
        int rootValue = scanner.nextInt();
        root = new Node(rootValue);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to insert left of: " + node.value);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the value of left of: " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to insert right of: " + node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the value of right of: " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }
    public void display() {
        display(this.root, "");
        System.out.println();
    }
    public void display(Node node, String indent){
        if (node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.display();        
    }
    
}
