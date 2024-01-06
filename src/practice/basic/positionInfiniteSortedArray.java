package practice.basic;

public class positionInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9 ,10, 90, 100};
        System.out.println(findPosition(arr, 10));
        
    }

    private static int findPosition(int[] arr, int target){
        // first try to find the range in which target exist
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int temp = end + 1;
            // increase the size of box
            end = end + (end - start + 1) * 2;
            start = temp + 1;
        }
        return binarySearch(arr, start, end, target);
    }

    private static int binarySearch(int[] arr, int start, int end, int target){
        while (start <= end ){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    
}
