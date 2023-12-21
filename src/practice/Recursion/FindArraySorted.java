package practice.Recursion;

public class FindArraySorted {
    public static void main(String[] args) {
        int[] arr = {10,20, 30, 50, 40, 60};
        System.out.println(isSorted(arr, 0));
//
    }

//    static boolean isArraySorted(int[] arr, int i){
//        // add the base condition
//        if(i == arr.length - 1){
//            return true;
//        }
//        else if(arr[i] > arr[i + 1]){
//            return false;
//        }
//        else {
//            return isArraySorted(arr, i + 1);
//        }
//
//    }
//
    static boolean isSorted(int[] arr, int i){
         if(i == arr.length - 1){
            return true;
        }
        return arr[i] < arr[i + 1] && isSorted(arr, i + 1);

    }
}
