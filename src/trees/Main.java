package trees;

public class Main extends BST {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        InOrder inorder  = new InOrder();

        BST tree = new BST();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        inorder.inOrderTraversal(tree.root);
        System.out.println();
        tree.deleteInBST(tree.root, 7);
        
        inorder.inOrderTraversal(tree.root);
        System.out.println();
        
        // tree.populate(nums);
        // tree.populatedSorted(nums, 0, nums.length);
        // tree.display();
        // System.out.println(tree.searchNode(tree.root, 10));
        // System.out.println("\n");

        // PreOrderTraversal tree1 = new PreOrderTraversal();
        // tree1.preOrderTraversal(tree.root);
        // System.out.println("\n");

        
        // InOrder inorder = new InOrder();
        // inorder.inOrderTraversal(tree.root);

        // System.out.println("\n");
        

        // PostOrder postorder = new PostOrder();
        // postorder.postOrder(tree.root);
        // System.out.println();
    }

    
}
