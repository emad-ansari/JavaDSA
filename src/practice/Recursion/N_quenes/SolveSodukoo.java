package practice.Recursion.N_quenes;

public class SolveSodukoo {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {5, 3, 0, 0, 8, 0, 0, 7, 9}
        };
        sodukoo(arr, 0, 0);

    }
    static void sodukoo(int[][] board, int row, int col){

        if (row == board.length){
            display(board);
            return;
        }
        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length){
            sodukoo(board, row + 1, 0);
            return;
        }

        if (isEmpty(board, row, col)){
            for (int i = 1; i < 10 ; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = i;
                    sodukoo(board, row, col + 1);
                    board[row][col] = 0;
                }
            }
        }
        sodukoo(board, row, col + 1);

    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        boolean CHECK_ROW_AND_COL = checkRowAndCol(board, row, col,  num);
        boolean CHECK_SUBPART = checkSubPart(board, row, col, num);

        return CHECK_ROW_AND_COL && CHECK_SUBPART;  
    }

    static boolean checkSubPart(int[][] board, int row, int col, int num) {
        int rowStart = row - (row % 3);
        int colStart = col - (col % 3);

        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3 ; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }




    static boolean checkRowAndCol(int[][] board, int row,int col, int num) {
        //check for entire row
        for (int i = 0; i < board.length; i++) {
            if( board[row][i] == num){
                return false;
            }
        }

       // check for entire column
        for (int[] nums: board){
            if (nums[col] == num) {
                return false;
            }
        }
        return true;
    }

    static boolean isEmpty(int[][] board, int row, int col) {
        return board[row][col] == 0;
    }
    static void display(int[][] board){
        for (int[] row: board){
            for (int item: row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
