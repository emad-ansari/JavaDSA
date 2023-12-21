package practice.basic;

public class PrintArrayReverseOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 , 5};
        printReverse(arr, 0);


    }

//    Write a recursive program to print the array in reverse order
    static void printReverse(int[] arr, int index){
        if (index == arr.length - 1){
            System.out.println(arr[index]);
            return;
        }
        printReverse(arr, index + 1);
        System.out.println(arr[index]);
    }
}
