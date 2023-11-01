package practice.searchingalgorithm;

public class CeilingNumber {
    // find the ceiling number
    public static void main(String[] args) {
        int[] num = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(findCeiling(num, 4));

    }
    static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(arr[mid] < target){
                // move in right side
                start =  mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
