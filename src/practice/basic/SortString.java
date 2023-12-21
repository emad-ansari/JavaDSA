package practice.basic;

import java.util.Arrays;

class SortString {
    public static void main(String[] args) {
        String str = "dhjfgkf";
        sortString(str);

    }
    static void sortString(String str){
        StringBuffer sortedString = new StringBuffer("");
        int[] asciiValue = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            asciiValue[i] = (int)(str.charAt(i));
        }
        
        // Arrays.sort(asciiValue);
        // sort the asciiValue array with merge sort
        int[] sortedArray = sort(asciiValue);

        for (int i = 0; i < sortedArray.length; i++) {
            char ch = (char)(sortedArray[i]);
            sortedString.insert(i, ch);
        }

        System.out.println(sortedString);
  
    }

    static int[] sort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right){
        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                ans[k] = left[i];
                i++;
            }
            else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }    
}