package practice.Recursion;

public class findPivot {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2,3};
        System.out.println(find_pivot(arr, 1));

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
}
