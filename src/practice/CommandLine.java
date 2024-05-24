package practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CommandLine {
    public static void main(String[] args) {
        // number of characters.
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };

        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n,
                new Comparator<HuffmanNode>() {
                    @Override
                    public int compare(HuffmanNode x, HuffmanNode y) {
                        return x.data - y.data;
                    }
                }
        );
        for (int i = 0; i < n; i++) {
            HuffmanNode node = new HuffmanNode();
            node.c = charArray[i];
            node.data = charfreq[i];

            node.left = null;
            node.right = null;

            q.add(node);
        }
        // remove two minimum node from queue
        HuffmanNode root = null;
        while (q.size() > 1){

            // remove first smallest element
            HuffmanNode first = q.peek();
            q.poll();

            // remove second smallest element
            HuffmanNode second = q.peek();
            q.poll();

            HuffmanNode newNode = new HuffmanNode();
            newNode.c = '-';
            newNode.data = first.data + second.data;

            newNode.left = first;
            newNode.right = second;

            root = newNode;
            q.add(newNode);
        }

        // after making tree print the code
        printCode(root, "");
    }

    private static void printCode(HuffmanNode root, String s){
        // base condition -> if root.left and root.right is null means we are at leaf node hence print path
        if (root.left == null && root.right == null && Character.isLetter(root.c)){
            System.out.println(root.c + " : " + s);
            return;
        }
        // make left and right call
        printCode(root.left, "0");
        printCode(root.right, "1");
    }





}
 class HuffmanNode {
    char c;
    int data;

    HuffmanNode left;
    HuffmanNode right;
}
