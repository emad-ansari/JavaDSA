package practice.exam;

public class Question20 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printPattern(matrix);

    }
//    Write a Java program to print first row from left to right then last column
//    from top to bottom then last row from right to left then first column from bottom to top in NxN matrix.

    static void printPattern(int[][] matrix){
        // from left to right
        Left_To_Right(matrix, 0, 0);
        System.out.println();
        top_To_bottom(matrix, 0, 2);
        System.out.println();
        right_To_left(matrix, 2, 2);
        System.out.println();
        bottom_To_top(matrix, 2, 0);
    }
    static void Left_To_Right(int[][] matrix, int row, int col){
        while (col < matrix[0].length){
            System.out.print(matrix[row][col++] + " ");
        }
    }


    static void top_To_bottom(int[][] matrix, int row, int col){
        while (row < matrix[0].length){
            System.out.print(matrix[row++][col] + " ");
        }
    }
    static void right_To_left(int[][] matrix, int row, int col){
        while (col >= 0){
            System.out.print(matrix[row][col--] + " ");
        }
    }
    static void bottom_To_top(int[][] matrix, int row, int col){
        while (row >= 0){
            System.out.print(matrix[row--][col] + " ");
        }
    }
}
