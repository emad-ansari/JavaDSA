package practice.exam;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] row: matrix){
            for (int item: row){
                System.out.print(item + " ");
            }
            System.out.println();

        }
        System.out.println();
        int[][] transposeMatrix = transpose(matrix);
        for (int[] row: transposeMatrix){
            for (int item: row){
                System.out.print(item + " ");
            }
            System.out.println();

        }

    }
    static int[][] transpose(int[][] matrix){
        int[][]  transposeMatrix  = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}
