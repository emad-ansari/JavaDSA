package practice.exam;

public class SmallestElementUsingRec {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, -2, 1, 0};

        System.out.println(find_smallest(arr, 0, Integer.MAX_VALUE));

    }
//    Write a program in Java to find the smallest element in array using recursion.

    static int find_smallest(int[] arr, int index,  int smallest){
        if (index == arr.length){
            return smallest;
        }
        if (arr[index] < smallest){
            return find_smallest(arr, index + 1, arr[index]);
        }
        else {
            return find_smallest(arr, index + 1, smallest);
        }
    }
}
