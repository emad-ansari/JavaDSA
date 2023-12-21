package practice.Recursion;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9, 10 , 5, 7, 8,};
        System.out.println(findTarget(arr, 10, 0));

    }

    static int findTarget(int[] arr, int target, int index){
        // base condition
        if(index == arr.length){
            // it means that target not found
            // then just return -1
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        else {
            // call the next recursion level
            return findTarget(arr, target, index + 1);
        }

    }
}
