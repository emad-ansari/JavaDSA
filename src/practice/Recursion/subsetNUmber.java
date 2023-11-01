package practice.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetNUmber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicateNumber(arr);
        for (List<Integer> list: ans){
            System.out.println(list);
        }

    }

    static List<List<Integer>> subsetNumber(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        //  creating  an empty array list inside outer arraylist
        outer.add(new ArrayList<>());

        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

     static List<List<Integer>> subsetDuplicateNumber(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        //  creating  an empty array list inside outer arraylist
        outer.add(new ArrayList<>());
        int start ;
        int end = 0;

        for (int i = 0; i < arr.length; i++){
            start = 0;
            int n = outer.size();
            if(i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;

            for (int j = start; j <= end; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
