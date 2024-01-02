package practice.searchingalgorithm;
import java.util.Arrays;

public class TargetInMatrixWithBinary {
    public static void main(String[] args) {
        
        int[][] arr = {
                {1 , 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(findTarget(arr, 3 )));

    }

    static int[] findTarget(int[][] arr, int target){
        // first take the middle column and perform binary search on it
        int rStart = 0;
        int rEnd = arr.length - 1;
        int cMid  = (arr.length - 1) / 2;
        // run the loop till the two rows are  remaining.
        while(rStart < rEnd - 1){
            int rMid = rStart + (rEnd - rStart) / 2;
            if(arr[rMid][cMid] == target){
                return new int[]{rMid , cMid};
            }
            // ignore the rows
            if(arr[rMid][cMid] > target){
                rEnd = rMid;
            }
            else {
                rStart = rMid;
            }
        }


        // Now we have only two rows left at the end.

        int cEnd = arr.length - 1;
        // check whether the middle column you are contain the ans or not
        if(arr[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if( arr[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }


        // now consider the four parts

        // first  part
        if( target <= arr[rStart][cMid]){
            return binarySearch(arr, rStart, 0, cMid - 1, target );
        }


        // second part
        if(target >= arr[rStart][cMid] && target <= arr[rStart][cEnd]){
            return binarySearch(arr, rStart, cMid + 1, cEnd, target);
        }


        // third part

        if(target <= arr[rStart + 1][cMid]){
            return binarySearch(arr, rStart + 1, 0, cMid -1, target);
        }

        // fourth part
        else {
            return binarySearch(arr, rStart + 1, cMid + 1, cEnd, target);
        }


    }

    static int[] binarySearch(int arr[][], int row , int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(arr[row][mid] == target){
                return new int[]{row, mid};
            }
            if(arr[row][mid] < target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
