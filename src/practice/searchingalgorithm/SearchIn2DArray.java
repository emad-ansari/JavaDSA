package practice.searchingalgorithm;

import java.util.Arrays;

public class SearchIn2DArray {
    // search in 2D Array
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(findTarget(arr,7 )));

    }
    static int[] findTarget(int[][] num, int target){
        if(num.length == 0){
            return new int[]{-1, -1};
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}


