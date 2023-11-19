package practice.basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 13, 20, 24, 30, 51, 70};
        System.out.println(binaryRec(arr,60, 0, arr.length - 1));

    }
    static int binary(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start)/ 2;
            if (arr[mid] == key){
                return mid;
            }
            if (key < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }


    static int binaryRec(int [] arr, int key, int s, int e){
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s)/ 2;
        if (arr[mid] == key){
            return mid;
        }
        if (arr[mid] < key){
            return binaryRec(arr, key, mid + 1, e);
        }
        else {
            return binaryRec(arr, key, s, mid - 1);
        }
    }
}
