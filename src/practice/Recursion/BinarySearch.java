package practice.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 11, 20};
        System.out.println(binarySearch(arr, 0, arr.length -1, 5));

    }

    static int binarySearch(int[] arr, int start, int end, int target){
        if(end < start){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(target > arr[mid]){
            // search in right hand side of the array
            return binarySearch(arr, mid + 1, end, target);
        }
        if(target < arr[mid]){
            // search in left hand side of the array.
            return binarySearch(arr, start, mid - 1, target);
        }
        else {
            return mid;
        }
    }
}
