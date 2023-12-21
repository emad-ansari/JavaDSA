package practice.Leetcode;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int[] arr = { 2, 1, 1};
        System.out.println("Third maximum element is : " + thirdMax(arr));


    }

    public static int thirdMax(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            int max = Integer.MIN_VALUE;
            for (int num : nums){
                if (num > max){
                    max = num;
                }
            }
            return max;
        }


       long fMax = Long.MIN_VALUE;
       long sMax = Long.MIN_VALUE;
       long tMax = Long.MIN_VALUE;
       for (int num : nums){
           if (num > fMax){
               tMax = sMax;
               sMax = fMax;
               fMax = num;
           }
           else if (num > sMax && num != fMax){
               tMax = sMax;
               sMax = num;
           }
           else if (num > tMax && num != fMax && num != sMax){
               tMax = num;
           }
       }
       if (tMax == Long.MIN_VALUE){
           return (int)fMax;
       }
       return (int)tMax;

    }




    // find the Second max element of array
    static int findSecondMax(int[] arr){
        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for (int item: arr){
            if (item > fMax){
                sMax = fMax;
                fMax = item;
            }
            else if(item > sMax && item != fMax){
                sMax = item;
            }
        }
        return sMax;
    }

}
