package practice.exam;

public class AppearedSingle {
    public static void main(String[] args) {

        int[] arr = {10, 20 , 10,  30, 40, 50, 40, 50, 60, 10};
        print_single_element(arr);

    }
//    Write a Java program to print elements which are appeared single time in array of integers.
    static void print_single_element(int[] arr){
        boolean[] element_appear_time = new boolean[arr.length];

        int repeatCount = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !element_appear_time[j]){
                    element_appear_time[j] = true;
                    repeatCount++;
                }
            }
            if (repeatCount == 1 && !element_appear_time[i]){
                System.out.println("Number " + arr[i] + " is appear one");
            }
            repeatCount = 1;
        }

//        for (int i = 0; i < arr.length; i++) {
//            if (!element_appear_time[i]){
//                System.out.println("Number " + arr[i] + "is appear one");
//            }
//        }

    }

}
