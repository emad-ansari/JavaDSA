package practice.Recursion;

public class PrintTriangle {
    public static void main(String[] args) {
        printPattern(4, 0);

    }
    static void printPattern(int row , int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("*" + " ");
            printPattern(row, col + 1);
        }
        else {
            // print new line and row = row -1
            System.out.println();
            printPattern(row - 1, 0);
        }

    }

}
