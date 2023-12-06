package practice.exam;

import java.util.Arrays;
// Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining
// the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.
// Question Number 58
public class MergeTwoSortedArray {
    public static void main(String[] args) {

        int[] first = { 1, 5, 6, 7, 8, 10 };
        int[] second =  { 2, 3,  4,  9, 11 };
        mergeTwoArray(first, second);

    }
    static void mergeTwoArray(int[] first, int[] second){
        int[] ans = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                ans[k] = first[i];
                i++;
            }
            else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            ans[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            ans[k] = second[j];
            j++;
            k++;
        }

        // now answer array will contain the sorted array after merging the first ans second array
        // now fill the first array and second array
        int index = 0;
        while (index < first.length){
            first[index] = ans[index];
            index++;
        }
        int index2 = 0;
        while (index2 < second.length){
            second[index2] = ans[index];
            index++;
            index2++;
        }

        System.out.println("First Array : " + Arrays.toString(first));
        System.out.println("Second Array : " + Arrays.toString(second));

    }
}
