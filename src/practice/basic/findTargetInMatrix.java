package practice.basic;
import java.util.Arrays;
public class findTargetInMatrix {
  public static void main(String[] args){
    int[][] matrix = {
      {10, 20 , 30, 40},
      {15, 25, 35, 45},
      {28, 29, 37, 49},
      {33, 34, 38, 50}
    };
    System.out.println(Arrays.toString(findTarget2(matrix, 30)));
  }

  // You have given a sorted matrix find the target using binary search in an array
  static int[] findTarget(int[][] matrix, int target){

    int row = 0;
    int col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0){
      int element = matrix[row][col];
      if (target == element){
        return new int[]{row, col};
      }
      if (target < element){
        col--;
      }
      else {
        row++;
      }
    }
    return new int[]{-1,-1};
  }


 static int[] findTarget2(int[][] matrix, int target){
     int rStart = 0;
     int rEnd = matrix.length - 1;
     int cMid = (matrix.length - 1) / 2;

     // run the loop till two rows are remaning
     while (rStart < rEnd - 1){
       int rMid = rStart + (rEnd - rStart) / 2;
       if (matrix[rMid][cMid] == target){
         return new int[]{rMid, cMid};
       }
       if (target < matrix[rMid][cMid]){
          rEnd = rMid;
       }
       else {
         rStart = rMid;
       }
     }
     // now at the end of above while loop we will have on two rows remaining
     // now check the whether the middle column contain the target element or not
     if (matrix[rStart][cMid] == target){
       return new int[]{rStart, cMid};
     }
     if (matrix[rStart + 1][cMid] == target){
       return new int[]{rStart + 1, cMid};
     }
     
     // now consider the four parts
     
    int cEnd = matrix.length - 1;
    // first part
    if (target <= matrix[rStart][cMid]){
       return binarySearch(matrix, rStart, 0, cMid -1, target); 
    } 
    
    // second part
    if (target >= matrix[rStart][cMid] && target <= matrix[rStart][cEnd]){
      return binarySearch(matrix, rStart, cMid + 1, cEnd, target);
    }

    // third part
  
    if (target < matrix[rStart + 1][cMid]){
      return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
    }

    else {
      return binarySearch(matrix, rStart + 1, cMid + 1, cEnd, target);
    }
 }
 static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
    while (cStart <= cEnd){
      int mid = cStart + (cEnd - cStart) / 2;
      if (matrix[row][mid] == target){
        return new int[]{row, mid};
      }
      if (target < matrix[row][mid]){
         cEnd =  mid - 1;
      }
      else {
        cStart = mid + 1;
      }
    }
    return new int[]{-1, -1};
  }
}
