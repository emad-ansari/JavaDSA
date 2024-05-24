package backtracking;



public class NQueen {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println("All possible solutions: " + queens(board, 0));



    }
    public static int queens(boolean[][] board, int row){
        // base condition -> when row = board.length , means all queens has been placed
        if (row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        // place queen row by row
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row + 1);
                // while backtrack, revert the changes that you make
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        // check vertically
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        // check left diagonal
        int maxLeft = Math.min(row , col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]){
                return false;
            }
        }
        // check for right diagonal
        int maxRight = Math.min(row, board.length -col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }
        return true;
    }


    private static void display(boolean[][] board){
        for (boolean[] row: board){
            for (boolean item: row){
                if (item){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
