package practice.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindTargetInRepeatedNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 9, 6, 10, 18, 6, 7 , 3};
//        System.out.println(findTarget(arr, 6, 0, new ArrayList<>()));
        System.out.println(findTarget2(arr, 6, 0));



    }
    static ArrayList<Integer> findTarget(int[] arr, int target,int index,  ArrayList<Integer>list ){

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return findTarget(arr, target, index + 1, list);
    }


    // returning an ArrayList without passing it as an argument
    static ArrayList<Integer> findTarget2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index  == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ans  = findTarget2(arr, target, index + 1);
        ans.addAll(list);
        return ans;
    }
}
