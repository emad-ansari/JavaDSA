package practice.searchingalgorithm;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        System.out.println(SearchWithBinary(arr, 14));

    }
    // Binary search algorithm.
    static int SearchWithBinary(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start)/ 2;
            if(arr[mid] == target){
                return mid;
            }            // search in right if target is greater than middle element
            if(arr[mid] < target){
                start = mid + 1;
            }
            // search in left , if my target is less than middle element
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

