package practice.Leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] arr= {2,7,4};
        addToArrayForm(arr, 181);

    }
    static void addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int n = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            sum = num[i] + k;
            if (sum > 9) {
                num[i] = sum % 10;
                n = (int) Math.log10(sum);
                k = sum / (int) Math.pow(10, n);
            } else {
                k = 0;
                num[i] = sum;

            }
        }
        System.out.println(Arrays.toString(num));
    }



}
