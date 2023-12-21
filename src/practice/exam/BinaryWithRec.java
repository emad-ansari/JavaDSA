package practice.exam;

public class BinaryWithRec {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        System.out.println(binaryWithRec(arr, 3, 0, arr.length -1 ));

    }
    static int binaryWithRec(int[] arr, int key, int s, int e){
        if (s > e){
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == key){
            return mid;
        }
        if (arr[mid] < key){
            return binaryWithRec(arr, key, mid + 1, e);
        }
        else {
            return binaryWithRec(arr, key, s, mid -1 );

        }
    }
}
