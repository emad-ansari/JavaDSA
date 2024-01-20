package practice.exam;
import java.util.Arrays;

/*
 * Worst Case Complexity: The worst-case situation is when the partitioning algorithm picks the largest or      smallest element as the pivot element every time. The worst-case time complexity of quicksort is O (n2) .
 * 
 * 
 * space complexity of quick sort is O(log(n))
 * 
 
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        System.out.println("Before sorting: "  + Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int low, int hi) {
        if (low > hi){
            return;
        }

        int start = low;
        int end = hi;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];
        
        while (start <= end){

            while(nums[start] < pivot){
                start++;
            }
            while (nums[end] > pivot){
                end--;
            }
            // once both loop will stop we be at voilated condition so we need to swap start and end
            if (start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        // now when outer while loop will end our pivot will be at correct position 
        // now we can do the same thing for left and right part 
        quickSort(nums, low, end);
        quickSort(nums, start, hi);

    }


    
}
