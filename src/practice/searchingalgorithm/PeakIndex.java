package practice.searchingalgorithm;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 15, 2, 1};
        System.out.println("Peak index of given mountain array is : "  + findPeakIndex(arr));

    }

    static int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]){
                // I am in first part of th array
                start = mid + 1;
            }
            if(arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]){
                // I am in second part of the array
                end = mid - 1;
            }
        }
        return start;

    }
}
