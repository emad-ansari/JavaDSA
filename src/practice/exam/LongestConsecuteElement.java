package practice.exam;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecuteElement {
    public static void main(String[] args) {
        int[] arr = {49, 1 ,3 , 200, 2, 4, 70, 5, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println("Length of Longest consecutive element : " + longestConsecutiveElement(arr));
    }
// Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
     static int longestConsecutiveElement(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int index = 0;
        int length = 0;
        while (index < arr.length - 1){
            if (arr[index + 1] == arr[index] + 1){
                length++;
            }
            else {
                if (length != 0){
                    list.add(length + 1);
                    length = 0;
                }
            }
            index++;
        }
         int max = list.get(0);
         if (!list.isEmpty()){
            for (int item: list){
                if (item > max){
                    max = item;
                }
            }
         }
         return max;
     }
}
