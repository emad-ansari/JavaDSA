package practice.exam;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9};
        Count_Even_And_Odd(arr);

    }
    static void Count_Even_And_Odd(int[] arr){
        int evenCount = 0;
        int oddCount = 0;
        for (int num: arr){
            if (num % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Number of even Numbers: " + evenCount);
        System.out.println("Number of odd Numbers: " + oddCount);

    }

}
