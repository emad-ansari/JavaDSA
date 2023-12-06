package practice.exam;


import java.util.Arrays;

public class RemoveDuplicateElement {

    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 40, 40, 50, 50, 60}; // {20, 30, 40, 50, 60}
        RemoveDuplicate(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void RemoveDuplicate(int[] arr){
        // first we need to sort the array
        Arrays.sort(arr);
        // not it has been sorted

        int[] ans = new int[arr.length];
        int index = 1;
        int i = 0;
        while (index < arr.length){
            if (arr[index] != arr[index - 1]){
                ans[i] = arr[index- 1];
                i++;

            }
            if (index == arr.length - 1 && arr[index] != arr[index - 1] ){
                ans[i] = arr[index];
                i++;
            }
            index++;
        }
        arr = Arrays.copyOf(ans, i);
        System.out.println(Arrays.toString(arr));


    }
}
