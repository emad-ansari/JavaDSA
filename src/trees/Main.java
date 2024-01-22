package trees;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BST tree = new BST();
        // tree.populate(nums);
        tree.populatedSorted(nums, 0, nums.length);
        tree.display();
        System.out.println("\n");

        PreOrderTraversal tree1 = new PreOrderTraversal();
        tree1.preOrderTraversal(tree.root);
        System.out.println("\n");

        
        InOrder inorder = new InOrder();
        inorder.inOrderTraversal(tree.root);

        System.out.println("\n");
        

        PostOrder postorder = new PostOrder();
        postorder.postOrder(tree.root);
        System.out.println();
    }

    
}
