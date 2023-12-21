package practice.searchingalgorithm;

public class findTarget {
    public static void main(String[] args) {
        int[] nums = {10,20, 30, 40, 50, 60};
        System.out.println(searchTarget(nums, 80));

    }
    static int searchTarget(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // search one by one in array
        for(int index = 0; index < arr.length; index ++){
            if (arr[index] == target) {
                return index;
            }

        }
        return -1;

    }
}
