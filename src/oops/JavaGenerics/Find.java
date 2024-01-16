package oops.JavaGenerics;

public class Find {

    public static <T extends Number , character> int findNum(T[] arr, T target, boolean isSorted){
        // check if array is sorted then apply the binary search otherwise apply linear search 
        if (isSorted){
            // return binarySearch(T[] arr, T target);
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }

        }
        return -1;
    }
    // private static <T> int binarySearch(T[] arr, T target){
    //     int start = 0;
    //     int end = arr.length - 1;

    //     while (start <= end){
    //         int mid = start + (end - start) / 2;
    //         if (arr[mid] == target){
    //             return mid;
    //         }
    //         // else if (target > arr[mid]){
                
    //         // }
    //     }

    // }
}


/* write the generalize logic to find the target in integer array,  double array, character array, string array.

 * what programer will do basically ?
 * 
 * Ans: they will pass the array and target of type that they want to find in some target value 
 * 
 * 
 */