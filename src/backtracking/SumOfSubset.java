package backtracking;

import java.util.ArrayList;

public class SumOfSubset {
    public static void main(String[] args) {
        int[] arr = {5, 10};
        int totalWeight = 0;
        for (int item: arr){
            totalWeight += item;
        }
        findSubset(arr,0,  0, totalWeight, 15, new ArrayList<>());

    }

    public static void findSubset(int[] arr, int i,  int currentSum, int totalWeight, int m, ArrayList<Integer> subset){
        /*
         edge conditions =>
          1. if currentSum == m then found one possible subset
          2. if currentSum > m then just kill the node
          3. if totalWeight < (m - currentSum) then just kill the node
         */


        if (currentSum == m){
            System.out.println(subset);
            return;

        }
        if ((i >= arr.length) || (currentSum > m) || (totalWeight < (m - currentSum))){
            return;
        }
        // for loop

        // include object
        subset.add(arr[i]);
        findSubset(arr, i + 1, currentSum + arr[i], totalWeight - arr[i], m , subset);

        subset.removeLast();
        // exclude object
        findSubset(arr, i+ 1, currentSum, totalWeight - arr[i], m, subset);

    }

}
