package trees;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        BST tree = new BST();
        tree.populate(nums);
        tree.display();
        
    }
    
}
