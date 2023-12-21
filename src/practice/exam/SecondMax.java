package practice.exam;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4};
        System.out.println(secondLargest(arr));
        System.out.println(secondSmallest(arr));

    }
    static int secondLargest(int[] arr){
        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > fMax) {
                sMax = fMax;
                fMax = j;
            } else if (j > sMax && j != fMax) {
                sMax = j;
            }
        }
        return sMax;

    }

    // find the second-smallest element
    static int secondSmallest(int[] arr){
        int fMin = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for (int item: arr){
            if (item < fMin){
                sMin = fMin;
                fMin = item;
            }
            else if (item < sMin && item != fMin ){
                sMin = item;
            }
        }
        return sMin;
    }
}
