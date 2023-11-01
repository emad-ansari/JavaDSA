package practice.searchingalgorithm;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int[] arr = {48, 36, 20, 14, 12, 11, 9, 6, 4, 2};
        System.out.println(agnosticSearch(arr, 4));
    }


    static int agnosticSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        if(checkOrder(arr)){
            // call the ascending sorted array
            return AscendingOrder(arr, target);
        }
        else {
            //call the descending sorted array
            return DescendingOrder(arr, target);
        }

    }


    static int AscendingOrder(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int DescendingOrder(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // in this case if target is greater than middle element => that search in left
            // else search in right
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
    static boolean checkOrder(int[] arr){
        return arr[0] < arr[arr.length - 1];
    }
}
