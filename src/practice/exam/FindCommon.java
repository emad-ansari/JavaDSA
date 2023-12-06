package practice.exam;

import java.util.ArrayList;

public class FindCommon {
    public static void main(String[] args) {
        int[] first = {1, 5, 8, 11};
        int[] second = {4, 7, 8, 9, 11, 12};
        System.out.println("Common elements are : " + find_common(first, second));

    }

//    Write a Java program to find non-common elements in two sorted (in non-decreasing order) arrays.
    static ArrayList<Integer> find_common(int[] first, int[] second){
        ArrayList<Integer>  LIST_OF_COMMON_ELEMENTS = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < first.length && j < second.length){
            if (first[i] == second[j]){
                LIST_OF_COMMON_ELEMENTS.add(first[i]);
            }
            if (first[i] < second[j]){
                i++;
            }
            else {
                j++;
            }
        }
        return LIST_OF_COMMON_ELEMENTS;
    }
}
