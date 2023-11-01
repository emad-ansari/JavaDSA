package practice.Recursion;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        System.out.println(rbs(arr, 4));

    }
    static int rotatedBinarySearch(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == arr[mid]){

            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return rotatedBinarySearch(arr, start , mid - 1, target);
            }
            else {
                return rotatedBinarySearch(arr, mid + 1 , end, target);
            }
        }
        if(target >= arr[mid] && target <= arr[end]){
            return rotatedBinarySearch(arr, mid + 1, end , target);
        }
        return rotatedBinarySearch(arr, start, mid - 1, target);
    }


    static int rbs(int[] arr, int target){
        int pivotIndex = find_pivot(arr,1);
        if(target <= arr[pivotIndex] && target > arr[arr.length - 1]){
            // apply binary search on first half of the array
            return binary(arr, 0, pivotIndex , target);
        }
        else {
            return binary(arr, pivotIndex + 1, arr.length -1, target);
        }
    }

    static int find_pivot(int[] arr, int index){
        if(arr[index] > arr[index - 1] && arr[index] > arr[index + 1]){
            return index;
        }
        if(arr[index] < arr[index - 1] && arr[index] < arr[index + 1]){
            return index - 1;
        }
        else {
            return find_pivot(arr, index + 1);
        }
    }

    static int binary(int[] arr, int start, int end, int target){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(target > arr[mid]){
            return binary(arr, mid + 1, end, target);
        }
        else {
            return binary(arr, start, mid - 1, target);
        }

    }
}
