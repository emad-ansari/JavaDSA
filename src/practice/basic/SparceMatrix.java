package practice.basic;

public class SparceMatrix {
    public static void main(String[] args) {
        int[][] Matrix = {
            {0 , 0 , 3 , 0 , 4 },
            {0 , 0 , 5 , 7 , 0 },
            {0 , 0 , 0 , 0 , 0 },
            {0 , 2 , 6 , 0 , 0 }
        };
        sparceMatrix(Matrix);
    }


    // represent a matrix in form of sparse matrix

    static void sparceMatrix(int[][] matrix){
        int size = 0;
        for (int[] row: matrix){
            for (int col: row){
                if (col != 0){
                    size++;
                }
            }
        }
        int col = 0;
        int[][] newMatrix = new int[3][size];
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0){
                    newMatrix[0][col] = i;
                    newMatrix[1][col] = j;
                    newMatrix[2][col] = matrix[i][j];
                    col++;
                }
            }
        }
        for (int[] i: newMatrix){
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Write a program to check whether a matrix is sparse or not
    static boolean isSparse(int[][] matrix){
        int zeros = 0;
        int non_zeroes = 0;
        for (int[] row: matrix){
            for (int col: row){
                if (col == 0){
                    zeros++;
                }
                else{
                    non_zeroes++;
                }
            }
        }
        return zeros >= non_zeroes;
    }
}
