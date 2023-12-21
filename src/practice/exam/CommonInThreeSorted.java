package practice.exam;

import java.util.ArrayList;

public class CommonInThreeSorted {
    public static void main(String[] args) {
        int[] first = {2, 4, 8, 10};
        int[] second = {2, 3, 4, 8, 10, 16};
        int[] third =  {4, 8, 10,  14, 40};
        System.out.println(findCommonNumber(first, second, third));
    }


    static ArrayList<Integer> findCommonNumber(int[] first, int[] second, int[] third){
        ArrayList<Integer> commonNumber = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length && k < third.length){
            if (first[i] == second[j] && second[j] == third[k]){
                commonNumber.add(first[i]);
                i++;
                j++;
                k++;
            }
            else if (first[i] < second[j]){
                i++;
            }
            else if (second[j] < third[k]){
                j++;
            }
            else {
                k++;
            }
        }

        return commonNumber;
    }
}