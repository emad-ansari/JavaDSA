package practice.exam;

public class Question19 {
    public static void main(String[] args) {
        int[][] matrix  = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        findSum(matrix);

    }
//    Write a program in Java to find sum of odd elements of even rows and even elements of odd rows.
    static void findSum(int[][] arr){
        int Odd_Element_Of_Even_Rows = 0;
        int Even_Element_Of_Odd_Rows = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                // for odd rows  even sum
                for (int num: arr[i]){
                    if (num % 2 == 0){
                        Even_Element_Of_Odd_Rows += num;
                    }
                }
            }
            else {
                // for even rows odd sum
                for (int num : arr[i]){
                    if (num % 2 != 0){
                        Odd_Element_Of_Even_Rows += num;
                    }
                }
            }
        }

        System.out.println("Sum of odd elements of even rows: " + Odd_Element_Of_Even_Rows);
        System.out.println("Sum of even elements of odd rows: " + Even_Element_Of_Odd_Rows);
    }
}
