package practice.basic;

public class CeilingNumber {
    public static void main(String[] args) {
        // you have given an array find the ceiling number of a given number 
        int[] arr = {1, 3, 5, 9, 14, 16, 18};
        System.out.println(findCeilingNumber(arr, 18));

    }
    static int findCeilingNumber(int[] arr, int target){
        if (target > arr[arr.length - 1] || target == arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return arr[mid + 1];

            }
            if (target < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return arr[start];
    }

    
}
