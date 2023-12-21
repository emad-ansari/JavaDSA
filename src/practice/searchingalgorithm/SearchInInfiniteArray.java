package practice.searchingalgorithm;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        // Q : find the position of element in an infinite array
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 123, 124, 145, 167, 200, 245, 300};
        System.out.println(ans(arr, 3));

    }
    static int ans(int[] arr, int target){
        // first find the range
        // first take the box of size two
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1; // this is my new start
            // increase the size of box
            end = end + (end - start + 1)*2; // this is my new end
            start = temp;
        }
        return binarySearch(arr, start, end, target);

    }
    static int binarySearch(int[] arr, int start , int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                // move in right side
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}